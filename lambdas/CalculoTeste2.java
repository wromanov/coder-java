package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        /* Lambdas são funções anonimas que são possíveis de associar os resultados dessas funções a uma variável.*/

        //Função Lambda diretamente associada a variável calc.
        Calculo calc = (x, y) -> {
            return  x + y;
        };

        System.out.println(calc.executar(2, 3));

        //Quando omitimos a chave na função lambda, ela irá automaticamente realizar um return da função.
        //Porém não podemos escrever blocos de códigos dentro da função.

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));

        Calculo cal02 = (x, y) -> { double resultado; resultado =  x - y; return resultado;};
        System.out.println(cal02.executar(2,3));

        System.out.println(cal02.legal());

        System.out.println(Calculo.muitoLegal());


    }


}
