package excecao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClasseChecked {
    public static void main(String[] args) {

        //Exceções do Tipo Checked precisam ser tratadas, para que o programa execute.

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
