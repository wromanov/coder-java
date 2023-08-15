package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        //Interface Function que representa uma função que aceita um único argumento e produz um resultado (de escolha do desenvolvedor).

        /* Na ordem temos "A função Function" que recebe como argumento um "Integer" e produz como resultado uma "String",
         * logo em seguida temos a variável "parOuImpar" que vai receber a expressão lambda, em seguida temos o parâmetro "número" do tipo integer,
         * em seguida uma expressão ternária, para verificar se o número é par ou impar. */

        //Obs quanto maior a função, mais difícil será para reutilizar essa função em mais locais dentro do sistema.

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par": "Ímpar";

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        System.out.println(parOuImpar.apply(32));


        //Composição de Funções (Usa-se várias funções uma junto com a outra, e depois encadeia essas funções).

        /* Foi chamado a função "parOuImpar", em seguida o resultado que é uma string foi passada como argumento para a função "oResultadoE",
         * a qual também espera receber uma String, o qual o resultado é uma String é passada como argumento para a função "empolgado".*/

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);


    }


}
