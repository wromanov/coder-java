package oo.composicao;

public class CompraTeste {

    /* Relação 1 para muitos, ou seja, 1 compra tem relação com vários itens e um item tem relação apenas com uma compra */

    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.cliente = "Walace";

        //Adicionando Item através do método criado
        compra1.adicionarItem(new Item("Caneta", 20, 7.45));

        //Adicionando Item através do segundo método que chama o primeiro método e não se faz necessário criar novo objeto.
        compra1.adicionarItem("Lápis", 10, 1.45);
        compra1.adicionarItem("Livro", 13, 23.45);

        //Adicionando Item pelo atributo do item.
        compra1.itens.add(new Item("Borracha", 12, 3.89));
        compra1.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println("Quantidades de Itens: " + compra1.itens.size());
        System.out.println("Valor da Compra: R$ " + compra1.obterValorTotal());
        //System.out.println("Lista de Compras: " + compra1.itens);









    }

}
