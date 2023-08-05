package oo.composicao;

public class CompraTeste {

    /* Rela��o 1 para muitos, ou seja, 1 compra tem rela��o com v�rios itens e um item tem rela��o apenas com uma compra */

    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.cliente = "Walace";

        //Adicionando Item atrav�s do m�todo criado
        compra1.adicionarItem(new Item("Caneta", 20, 7.45));

        //Adicionando Item atrav�s do segundo m�todo que chama o primeiro m�todo e n�o se faz necess�rio criar novo objeto.
        compra1.adicionarItem("L�pis", 10, 1.45);
        compra1.adicionarItem("Livro", 13, 23.45);

        //Adicionando Item pelo atributo do item.
        compra1.itens.add(new Item("Borracha", 12, 3.89));
        compra1.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println("Quantidades de Itens: " + compra1.itens.size());
        System.out.println("Valor da Compra: R$ " + compra1.obterValorTotal());
        //System.out.println("Lista de Compras: " + compra1.itens);









    }

}
