import java.util.StringTokenizer;

public class TipoR {
    public static String tratar(String operacao, StringTokenizer st){
        String rs = "00000";
        String rt = "00000";
        String rd = "00000";
        String shamt = "00000";
        if (operacao.equals("add") || operacao.equals("sub") ||
                operacao.equals("and") || operacao.equals("or") ||
                operacao.equals("xor")) {
            rd = st.nextToken();
            rs = st.nextToken();
            rt = st.nextToken();
        }
        else if (operacao.equals("sll") || operacao.equals("srl")) {
            rd = st.nextToken();
            rt = st.nextToken();
            String sh = st.nextToken();
            shamt = inteiroPara5Bits(sh); // converte shamt
        }
        else if (operacao.equals("jr")) {

            rs = st.nextToken();
        }
        // conversão pra binário
        String opcode = ConversorBinario.Binario6Bits(Dicionario.op, operacao);
        String rsBin;
        if (rs.equals("00000")) {
            rsBin = rs;
        }
        else {
            rsBin = ConversorBinario.paraBinario5Bits(Dicionario.reg, rs);
        }
        String rtBin;
        if (rt.equals("00000")) {
            rtBin = rt;
        }
        else {
            rtBin = ConversorBinario.paraBinario5Bits(Dicionario.reg, rt);
        }
        String rdBin;
        if (rd.equals("00000")) {
            rdBin = rd;
        }
        else {
            rdBin = ConversorBinario.paraBinario5Bits(Dicionario.reg, rd);
        }
        String funct = ConversorBinario.Binario6Bits(Dicionario.funct, operacao);
        return opcode + rsBin + rtBin + rdBin + shamt + funct;
    }
    // conversão shamt  5 bits(int)
    public static String inteiroPara5Bits(String valor){
        int num = Integer.parseInt(valor);
        String bin = Integer.toBinaryString(num);

        if (bin.length() > 5) {
            bin = bin.substring(bin.length() - 5);
        }

        while (bin.length() < 5) {
            bin = "0" + bin;
        }

        return bin;
    }
}