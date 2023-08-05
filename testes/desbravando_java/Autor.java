package testes.desbravando_java;

public class Autor {

    String nome;
    String email;
    String cpf;

    public String detalhesdoAutor() {
        return String.format("*--Mostrando detalhes do Autor--*\n"
                + "Autor Nome: %s\n"
                + "Autor E-mail: %s\n"
                + "Autor CPF: %s\n", nome, email, cpf);
    }

}
