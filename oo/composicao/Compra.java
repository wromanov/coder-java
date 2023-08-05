package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();


    //Método para adicionar um item a lista de compras, e simultaneamente, associar a compra ao item, criando uma relação bidirecional.
    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    //Método que automatiza a adição do item a lista, utilizando o método de acima.
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }



    //Método para calcular o valor total do carrinho
    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }


}
