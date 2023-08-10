package lambdas;

import java.util.function.BinaryOperator;
public class CalculoTeste3 {
    public static void main(String[] args) {

        /* Com interface funcional "BinaryOperator" não precisaríamos definir uma interface para executar uma operação, que recebe
         * dois parâmetros do mesmo tipo, e retorna o resultado do mesmo tipo dos parâmetros. */

        //Para tipos genéricos só é suporte classes, e nesse caso devemos usar os wraps "Double ou Integer".

        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(2d,3d));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(5.0,2.0));


        BinaryOperator<Integer> calc02 = (x, y) -> x + y;
        System.out.println(calc02.apply(1,3));

        calc02 = (x, y) -> x * y;
        System.out.println(calc02.apply(5,6));




    }


}
