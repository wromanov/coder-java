package lambdas;

import java.util.Arrays;
import java.util.List;
public class ForEach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Walace", "Eliane", "Sophia", "Nicolly", "Lucas", "Ezequiel");

        for (String nomes : aprovados) {
            System.out.println(nomes);

        }

        System.out.println("\nLambda #01...");

        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }


}
