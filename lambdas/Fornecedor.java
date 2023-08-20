package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        //Supplier é o tipo de interface que não recebe um parâmetro e retorna alguma coisa.

        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Edu");

        System.out.println(umaLista.get());


    }
}
