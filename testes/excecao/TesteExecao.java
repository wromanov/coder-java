package testes.excecao;

public class TesteExecao {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 1500);


        produto.adicionarEstoque(10);
        produto.ativarProduto();

        System.out.println("Quantidade Inicial");
        System.out.println(produto);
        System.out.println();

        comprar(produto, 11);

        System.out.println("Quantidade Final");
        System.out.println(produto);

    }

    public static void comprar(Produto produto, int quantidade) {
        try {
            produto.removerEstoque(quantidade);
        } catch (ProdutoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
