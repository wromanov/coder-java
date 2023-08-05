package testes.desbravando_java;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.adicionarAutor("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123.456.789.10");

        Livro outroLivro = new Livro("Lógica de Programação","Crie seus primeiros programas", 59.90, "978-85-66250-22-0" );

        outroLivro.adicionarAutor("Paulo Silveira", "paulo.silveira@caelum.com.br", "123.456.789.10");

        System.out.println(livro.detalhesdoLivro());
        System.out.println(livro.autor.detalhesdoAutor());



    }
}
