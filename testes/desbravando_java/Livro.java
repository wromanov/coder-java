package testes.desbravando_java;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor = new Autor();

    Livro() {

    }

    Livro(String nome, String descricao, double valor, String isbn) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    void adicionarAutor(String nome, String email, String cpf) {
        autor.nome = nome;
        autor.email = email;
        autor.cpf = cpf;
    }

    public String detalhesdoLivro() {
        return String.format("*--Mostrando detalhes do Livro--*\n"
                + "Nome: %s\n"
                + "Descrição: %s\n"
                + "Valor: R$ %.2f\n"
                + "ISBN: %s\n", nome, descricao, valor, isbn);
    }


    //Método incluído na Classe Autor para isolar esse comportamento.
/*
    public String detalhesdoAutor() {
        return String.format("*--Mostrando detalhes do Autor--*\n"
                + "Autor Nome: %s\n"
                + "Autor E-mail: %s\n"
                + "Autor CPF: %s\n", autor.nome, autor.email, autor.cpf);
    }*/


}
