package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {

/*      Desafio
        1. Número para string binária...
        2. Inverter a string...
        3. COnverter de volta para inteiro... */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<String> imprimir = System.out::println;

        //Convertendo Número para Binário
        Function<Integer, String> convertToBinary = n -> Integer.toBinaryString(n);

        //Invertendo a ordem dos números
        Function<String, String> invertOrder = n -> new StringBuilder(n).reverse().toString();

        //Convertendo para Decimal
        Function<String, Integer> ConvertToDecimal = n -> {
            //Convertendo Binário para Decimal, o "2" significa que estamos usando a base binaria para a conversão.
            int numeroDecimal = Integer.parseInt(n, 2);
            return numeroDecimal;
        };

        System.out.println("Convertendo Número em binário");
        numeros.stream().map(convertToBinary).forEach(System.out::println);
        System.out.println();

        System.out.println("Invertendo a ordem dos números binários");
        numeros.stream().map(Integer::toBinaryString).map(invertOrder).forEach(System.out::println);

        System.out.println("Convertendo os números invertidos para Decimal");
        numeros.stream().map(convertToBinary).map(invertOrder).map(ConvertToDecimal).forEach(System.out::println);




    }
}
