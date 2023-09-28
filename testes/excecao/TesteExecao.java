package testes.excecao;

public class TesteExecao {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 1500);


        produto.adicionarEstoque(10);

        System.out.println(produto);
        System.out.println();

        comprar(produto, 11);
        System.out.println();

        System.out.println(produto);




    }

    public static void comprar(Produto produto, int quantidade) {
        try {
            produto.removerEstoque(quantidade);
        } catch (ProdutoSemEstoqueException pse) {
            System.out.println("Erro: " + pse.getMessage());
        }
    }

}
