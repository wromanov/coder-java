package oo.composicao;

public class Item {
    String nome;
    int quantidade;
    double preco;

    Compra compra;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }



    public String toString() {

        return "Nome: " + nome + " - Quantidade: " + quantidade + " - Pre�o: R$ " + preco;
    }
}
