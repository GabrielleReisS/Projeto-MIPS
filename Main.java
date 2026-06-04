import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String numero, nomeEntrada, nomeSaida, linha,pendrive;
        pendrive="D:/";

        for(int i=1; i<=10; i++){

            numero = String.format("%02d", i); /*imprime o num com duas casas */
            nomeEntrada = pendrive+"TESTE-" + numero + ".txt";
            nomeSaida = pendrive+"TESTE-" + numero + "-RESULTADO.txt";

            try{
                BufferedReader ler = new BufferedReader(new FileReader(nomeEntrada)); /*BufferedReader lê tudo e FileReader lê cada caractere */
                FileWriter escrever = new FileWriter(nomeSaida); /*escrever cada caractere em um arquivo */

                while ((linha = ler.readLine()) != null) {
                    escrever.write(Conversor.converter(linha) + "\n");// depois vira conversão
                }

                ler.close();
                escrever.close();

            }catch(IOException e){ /*se der erro, entra no catch */
                e.printStackTrace(); /*mostra tudo sobre o erro */
            }
        }

    }
}

