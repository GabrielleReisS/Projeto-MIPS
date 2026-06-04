import java.util.HashMap;

public class ConversorBinario {

    // 5 bits
    public static String paraBinario5Bits(HashMap<String, Integer> mapa, String chave) {

        if (!mapa.containsKey(chave)) {
            return "Erro: chave não existe";
        }// verifica a existencia da chave

        int numero = mapa.get(chave);//pega o numero
        String bin = Integer.toBinaryString(numero);//conversão

        if (bin.length() > 5) {
            bin = bin.substring(bin.length() - 5);
        }//verifica se tem 5 bits

        while (bin.length() < 5) {
            bin = "0" + bin;
        }//garantia de ter 5 bits

        return bin;
    }

    // 6 bits
    public static String Binario6Bits(HashMap<String, Integer> mapa, String chave) {

        if (!mapa.containsKey(chave)) {
            return "Erro: chave não existe";
        }

        int numero = mapa.get(chave);
        String bin = Integer.toBinaryString(numero);

        if (bin.length() > 6) {
            bin = bin.substring(bin.length() - 6);
        }

        while (bin.length() < 6) {
            bin = "0" + bin;
        }//garante 6 bits

        return bin;
    }
}