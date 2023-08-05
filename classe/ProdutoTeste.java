package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 1000.0); //Estanciando variável do tipo produto
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        var p2 = new Produto(); // Estanciamento Por Inferencia
        p2.nome = "Caneta Preta";
        p2.preco = 12.00;


        Produto.desconto = 0.50; //Altera o valor do desconto

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
        System.out.printf("Média do Carrinho = R$ %.2f.\n", mediaCarrinho);



        //System.out.println(Produto.calcularPorcentagem(1000, 20));
        //System.out.println(Math.pow(81, 1.0/2.0)); //Método para realizar fatoração ao quadrado
        //System.out.println(Math.pow(27, 1.0/3.0)); //Método para realizar fatoração ao cubo
        //System.out.println(1 / 3);


    }
}
