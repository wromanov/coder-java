package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "AUDI ", "Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> transformaEmMaiuscula = n -> n.toUpperCase();
        UnaryOperator<String> getPrimeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!! ";

        System.out.println("\n\nUsando Composição...");
        marcas.stream().map(transformaEmMaiuscula).map(getPrimeiraLetra).map(grito).forEach(print);

        System.out.println("\n\nUsando Composição da Classe Utilitarios...");
        marcas.stream().map(Utilitarios.transformaEmMaiuscula).map(getPrimeiraLetra).map(Utilitarios::grito).forEach(print);





    }
}
