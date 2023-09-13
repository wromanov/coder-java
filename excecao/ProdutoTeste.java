package excecao;

public class ProdutoTeste {
    public static void main(String[] args) {

        /* Proteger o construtor com lançamento de exceção para:
         * Não receber um nome Null
         * Não receber quantidade menor ou igual 0
         */
        Produto p1 = new Produto("Caneta", 1);

        p1.adicionarEstoque(10);
        p1.ativar();

        /* Proteger o método com um lançamento de exceção para:
         * Não receber valores negativos.
         * Não retirar produtos com status inativo.
         * Não retirar quantidades maiores do que existe no estoque.
         * Assim interrompendo a execução desse método, para não deixar a instrução ser executada */

        p1.retirarEstoque(30);

        System.out.println(p1);






    }
}
