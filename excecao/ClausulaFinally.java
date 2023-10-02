package excecao;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClausulaFinally {
    public static void main(String[] args) {

        /* Finally é executado no final do try/cat, geralmente usado para limpeza de recursos */

        Path arquivo = Path.of("c:\\Users\\walac\\Desktop\\arquivo1.txt");

        BufferedReader reader = null;

        try {

            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        } finally {
            System.out.println("Debug: Finally");

            //Liberando recursos do reader.close;
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Erro fechando leitor de arquivo.");;
            }



        }


    }

}
