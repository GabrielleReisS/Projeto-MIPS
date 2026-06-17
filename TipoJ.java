import java.util.StringTokenizer;

public class TipoJ {

    public static String tratar(String operacao, StringTokenizer st){

        String endereco = "";

        if (operacao.equals("j")) {
            endereco = st.nextToken();
        }
        // conversão
        String opcode = ConversorBinario.Binario6Bits(Dicionario.op, operacao);
        String enderecoBin = inteiroPara26Bits(endereco);

        return opcode + enderecoBin;
    }

    //  função auxiliar conversão para 26 bits
    public static String inteiroPara26Bits(String valor){
        int num = Integer.parseInt(valor);
        String bin = Integer.toBinaryString(num);

        if (bin.length() > 26) {
            bin = bin.substring(bin.length() - 26);
        }

        while (bin.length() < 26) {
            bin = "0" + bin;
        }

        return bin;
    }
}
