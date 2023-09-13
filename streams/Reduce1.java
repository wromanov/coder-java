package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        /* Reduce - Utiliza um acumulador, para realizar uma operação com cada um dos elementos da lista */

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;

        //Soma todos os elementos da lista, sem passar o acumulador como parâmetro
        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println("Teste1: " + total1);

        //Soma todos os elementos da lista, passando o acumulador como parâmetro para o primeiro elemento, e somando com o próximo consecutivamente.
        Integer total2 = nums.stream().reduce(1, soma);
        System.out.println("Teste2: " + total2);

        //Soma todos os elementos da lista, passando o acumulador como parâmetro para cada um dos elementos (forma paralela, e somando com o próximo consecutivamente).
        Integer total3 = nums.parallelStream().reduce(1, soma);
        System.out.println("Teste3: " + total3);

        //Composição filter + reduce
        //ifPresent verifica se há algum resultado no stream reduce, caso sim, ele executa uma função.
        nums.stream().filter(n -> n >= 2).reduce(soma).ifPresent(System.out::println);




    }



}
