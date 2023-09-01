package testes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Funcional01 {
    public static void main(String[] args) {

        //Recebe 2 parâmetros ("a" e "b") de um determinado tipo "Double", sendo o retorno da função do mesmo tipo "Double".
        BinaryOperator<Double> teste01 = (a, b) -> {return a + b;};
        System.out.println(teste01.apply(1.2, 2.1));

        List<String> aprovados = Arrays.asList("Walace", "Eliane", "Sophia");
        aprovados.forEach(nome -> meuImprimir(nome));

    }
    static void meuImprimir(String nome) {
        System.out.println(nome + "Seja bem vindo!!!");
    }


}
