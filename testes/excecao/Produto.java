package testes.excecao;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    boolean status;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0){
            throw new IllegalArgumentException("Não pode dar entrada em valores negativos no estoque");
        }
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void ativarProduto() {
        this.status = true;
    }


    public String toString() {
       return String.format("Nome: %s\nQuantidade: %d\nPreço: %.2f", nome, quantidade, preco);
    }

}
