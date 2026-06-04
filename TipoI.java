import java.util.StringTokenizer;

public class TipoI {
    public static String tratar(String operacao, StringTokenizer st){
        String rs = "";
        String rt = "";
        String imediato = "";
        if (operacao.equals("lw") || operacao.equals("sw") ||
                operacao.equals("lb") || operacao.equals("lh") ||
                operacao.equals("sb") || operacao.equals("sh")) {
            rt = st.nextToken();
            imediato = st.nextToken();
            rs = st.nextToken();
        }
        else if (operacao.equals("addi") || operacao.equals("andi") ||
                operacao.equals("ori") || operacao.equals("xori")) {
            rt = st.nextToken();
            rs = st.nextToken();
            imediato = st.nextToken();
        }
        else if (operacao.equals("bne") || operacao.equals("beq")) {
            rs = st.nextToken();
            rt = st.nextToken();
            imediato = st.nextToken();
        }
        else if (operacao.equals("bgtz") || operacao.equals("blez")) {
            rs = st.nextToken();
            imediato = st.nextToken();
            rt = "00000"; // tratamento para os manual  casos que não usa rt
        }
        else if (operacao.equals("lui")) {
            rt = st.nextToken();
            imediato = st.nextToken();
            rs = "00000";// não utiliza rs
        }
        //Conversão completa para binario utlizandos os metodos
        String opcode = ConversorBinario.Binario6Bits(Dicionario.op, operacao);
        String rsBin;
        if (rs.equals("00000")) {
            rsBin = rs;
        } else {
            rsBin = ConversorBinario.paraBinario5Bits(Dicionario.reg, rs);
        }
        String rtBin;
        if (rt.equals("00000")) {
            rtBin = rt;
        } else {
            rtBin = ConversorBinario.paraBinario5Bits(Dicionario.reg, rt);
        }
        String imediatoBin = inteiroPara16Bits(imediato);

        return opcode + rsBin + rtBin + imediatoBin;
    }
    // Conversor para imediato(era para estar no conversor binario mas só indentifiquei a nescessidade depois)
    public static String inteiroPara16Bits(String valor){
        int num = Integer.parseInt(valor);
        String bin = Integer.toBinaryString(num);
        if (bin.length() > 16) {
            bin = bin.substring(bin.length() - 16);
        }
        while (bin.length() < 16) {
            bin = "0" + bin;
        }
        return bin;
    }
}