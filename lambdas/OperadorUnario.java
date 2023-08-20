package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        //Operador Unary recebe um tipo de parâmetro como entrada e retornar esse mesmo tipo como saída.
        //Permite fazer a composição de funções, ou seja, encadeamento de funções.

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;


        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

        //Compose é  contrário do andThen, a leitura é de trás para frente.
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);


    }
}
