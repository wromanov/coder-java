package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //Criando lambda Consumer, o qual não recebe nenhum parâmetro e retorna um resultado.
        Consumer<String> print = System.out::print;
        Consumer<Object> println = System.out::println;

        //Criando Stream de String
        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");

        //Criando um Array de Strings
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        //Criando uma Stream a partir de um Array
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        //Criando um Stram a partir da classe Ararys
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP", "Kotlin\n");

        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Gera uma Stream infinita que não tem uma ordenação, nesse tipo de stream usamos uma função Supplier.
        //Stream.generate(() -> "a").forEach(print);

        //Gera com ordenação, gera a iteração de números inteiros
        Stream.iterate(0, n -> n +1).forEach(println);


    }

}
