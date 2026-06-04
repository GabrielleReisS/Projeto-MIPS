import java.util.StringTokenizer;

public class Conversor {

    public static String converter(String linha){
        if (linha == null || linha.trim().isEmpty()) { //remove espaços e pega linha vazia
        return "";
    }
        StringTokenizer st = new StringTokenizer(linha, " ,()"); //st é um objeto que guarda o estado de como a string foi dividida e em que posição você está lendo ela agora.
        String operacao = st.nextToken();

        if(ehTipoR(operacao)){ //operacao 
            return TipoR.tratar(operacao, st);
        }else if(ehTipoI(operacao)){
            return TipoI.tratar(operacao, st);
        }
        else if(ehTipoJ(operacao)){
            return TipoJ.tratar(operacao, st);
        }

        return "Instrução inválida";
    }

    public static boolean ehTipoR(String operacao) {
        return operacao.equals("add") || operacao.equals("sub") 
        || operacao.equals("and") || operacao.equals("or") 
        || operacao.equals("xor") || operacao.equals("sll") 
        || operacao.equals("srl") || operacao.equals("jr");
    }
    public static boolean ehTipoI(String operacao) {
        return operacao.equals("addi") || operacao.equals("andi") 
        || operacao.equals("ori") || operacao.equals("xori") 
        || operacao.equals("lui") || operacao.equals("lw") 
        || operacao.equals("sw") || operacao.equals("lb")
        || operacao.equals("lh") || operacao.equals("sb")
        || operacao.equals("sh") || operacao.equals("beq") 
        || operacao.equals("bne") || operacao.equals("blez") 
        || operacao.equals("bgtz");
    }
    public static boolean ehTipoJ(String operacao) {
        return operacao.equals("j"); // substituir por código binário usando rs, rt, imediato
}

}
