package excecao;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
        //adicionarEstoque(quantidadeEstoque);
    }

    public void ativar(){
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Lança exceção se o nome for nulo
        Objects.requireNonNull(nome, "Nome deve ser informado.");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0){
            throw new IllegalArgumentException("A quantidade a ser adicionada no estoque deve ser maior que 0.");
        }
        this.quantidadeEstoque += quantidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    //Proteger o método com um lançamento de exceção para não receber valores negativos.
    //Assim interrompendo a execução desse método, para não deixar a instrução ser executada.
    public void retirarEstoque(int quantidade) {
        if (quantidade < 0) {
            //Lançando Exceção
            throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque.");

            //Lançando Exceção modo 2
            //IllegalArgumentException excecao = new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque.");
            //throw excecao;

            //Utilizando exceção pré-definida, exceções são objetos em java.
        }

        if (isInativo()) {
            //Exceção personalizada
            throw new ProdutoInativoException("Não pode realizar retirada de um produto inativo no estoque.");

            //throw new IllegalStateException("Não pode realizar retirada de um produto inativo do estoque.");
        }

        if (this.quantidadeEstoque - quantidade < 0) {
            throw new ProdutoSemEstoqueException("Quantidade a retirar do estoque, não pode ser maior que o volume contido no estoque.");
            //throw new IllegalArgumentException("Quantidade a retirar do estoque, não pode ser maior que o volume contido no estoque.");
        }

        this.quantidadeEstoque -= quantidade;
    }


    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String toString() {
        return "Nome: " + getNome()
                + "\nEstoque: "
                + getQuantidadeEstoque()
                + "\nStatus do Produto: " + isAtivo();
    }

}
