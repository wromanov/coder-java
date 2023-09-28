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

    public void ativarProduto() {
        this.status = true;
    }

    public boolean isAtivo() {
        return status;
    }

    public boolean isInativo() {
        return !status;
    }


    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0){
            throw new IllegalArgumentException("Não pode dar entrada em valores negativos no estoque.");
        }
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
        if (this.quantidade - quantidade < 0) {
            throw new ProdutoSemEstoqueException("Retirada do estoque, maior que o estoque disponível.");
        }

        if (isInativo()) {
            throw new ProdutoInativoException("Produto inativo no estoque.");
        }


        this.quantidade -= quantidade;
    }

    public String toString() {
       return String.format("Nome: %s\nQuantidade: %d\nPreço: %.2f", nome, quantidade, preco);
    }



}
