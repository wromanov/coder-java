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

        System.out.println("\nQuantidade Final");
        System.out.println(produto);



    }


    public static void comprar(Produto produto, int quantidade) {
        try {
            baixaEstoque(produto, quantidade);
        } catch (BaixaEstoqueException e) {
            System.out.println("Erro na compra: " + e.getCause().getMessage());
            e.printStackTrace();
        }
    }

    public static void baixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {
        try {
            produto.removerEstoque(quantidade);
        } catch (ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao efetuar baixa no estoque", e);
        }
    }



}
