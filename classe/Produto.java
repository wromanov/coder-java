package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    static String vendedor = "Walace"; //Atributo da Classe, será igual para todas as instâncias.

    //Construtor Padrão - Importante um construtor não recebe nenhum valor antes do nome.
    Produto() {
    }

    //Construtor Personalizado - Importante um construtor não recebe nenhum valor antes do nome.
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    //Método de Estância - Diferente do construtor tem um tipo definido antes do nome
    double precoComDesconto() {

        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {

        return preco * (1 - desconto + descontoDoGerente);
    }


    //Método Estático que pertence à classe e pode ser chamado a partir do nome da classe
    static double calcularPorcentagem(double valor, double valorPorcentagem) {
        return valor + (valor * (valorPorcentagem / 100));
    }



}
