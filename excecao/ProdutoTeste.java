package excecao;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        /* Proteger o construtor com lançamento de exceção para:
         * Não receber um nome Null
         * Não receber quantidade menor ou igual 0
         */

        Produto p1 = new Produto("Caneta");
        // p1.ativar();
        p1.adicionarEstoque(50);

        /* Proteger o método com um lançamento de exceção para:
         * Não receber valores negativos.
         * Não retirar produtos com status inativo.
         * Não retirar quantidades maiores do que existe no estoque.
         * Assim interrompendo a execução desse método, para não deixar a instrução ser executada */

        //p1.retirarEstoque(30);

        System.out.println(p1 + "\n");

        System.out.println("Qual quantidade você deseja comprar?");
        comprar(p1);

        System.out.println("\nQuantidade atual em estoque: " + p1.getQuantidadeEstoque());


    }

    static Scanner sc = new Scanner(System.in);

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
    }

    private static void comprar(Produto produto) {
        do {
            //"Try" = Tente executar o código, "Catch" = caso haja erro capture a exceção, dessa forma o código continua sua execução.
            try {
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra Realizada");

                //Se a execução chegar aqui nessa instrução, o laço será interrompido.
                break;

            } catch (IllegalArgumentException iae) {
                //Imprime no console o rastro da pilha de erro, muito usado quando está desenvolvendo.
                iae.printStackTrace();
                System.out.println("Erro na compra: " + iae.getMessage());

                //Relançando exceção para próximo frame.
                //throw iae;


            } catch (ProdutoSemEstoqueException pse) {
                //Imprime no console o rastro da pilha de erro, muito usado quando está desenvolvendo.
                //pse.printStackTrace();
                System.out.printf("Erro na compra: %s. Estoque disponível: %d. Quantidade Solicitada: %d\n",
                        pse.getMessage(), pse.getEstoqueDisponivel(), pse.getEstoqueSolicitado() );

            // Relançando exceção para próximo frame.
            //throw iae;

            } catch (ProdutoInativoException ise) {
                System.out.println("Produto não ativado: " + ise.getMessage());
                System.out.print("Deseja ativar o produto? ");
                String opcao = sc.next();
                if (opcao.equalsIgnoreCase("sim")) {
                    produto.ativar();
                } else {
                    break;
                }

            }  catch (ProdutoException pe) {
            System.out.println(pe.getClass().getName());
            System.out.println("Erro na compra: " + pe.getMessage());
            }


        } while (true);

    }


}
