package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Walace", "Eliane", "Sophia", "Nicolly", "Miguel", "Ezequiel");

        System.out.println("\nUsando For Normal");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }
        System.out.println();

        System.out.println("\nUsando ForEach");
        for (String imprimir : aprovados) {
            System.out.println(imprimir);
        }
        System.out.println();

        System.out.println("Usando Iterator");


        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) { //"hasNext" verifica se existe um próximo elemento na lista, se for verdadeiro ele entra no while.
            System.out.println(iterator.next()); //"Next" pega o próximo elemento da lista e retorna.
        }
        System.out.println();

        System.out.println("\nUsando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(nome -> System.out.println(nome)); //Laço Interno
        stream.forEach(System.out::println); //Laço Interno - Usando Função anonima

    }

}
