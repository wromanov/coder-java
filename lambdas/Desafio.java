package lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56
         */

        Produto p = new Produto("Ipad", 4000.0, 0.10);

        //Função para Calcular Preço com Desconto
        Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
        //System.out.println(precoComDesconto.apply(p));


        //Calculando Imposto Municipal
        UnaryOperator<Double> impostoMunicipal = (n1) -> {
            if (n1 >= 2500) {
                return n1 + (n1 * 0.085);
            }
            return n1;
        };

        //Calcular Valor do Frete
        UnaryOperator<Double> freteProduto = n1 -> {
            return n1 >= 3000 ? n1 + 100 : n1 + 50;
        };

        Function<Double, String> fomartar = preco -> ("R$ " + preco).replace(".",",");

        //Composição de Funções
        String precoFinal = precoComDesconto.andThen(impostoMunicipal).andThen(freteProduto).andThen(fomartar).apply(p);


        System.out.printf("Preço Final do Produto: %s.", precoFinal);


    }

}
