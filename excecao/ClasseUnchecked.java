package excecao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClasseUnchecked {
    public static void main(String[] args) {

        //Criando Caminho para o Arquivo
        Path arquivo = Path.of("C:\\Users\\walacedelgado\\Desktop\\teste.txt");

        //Criando o Arquivo
        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());;
        }
    }

}
