package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome) {

        this.nome = nome;
    }

    //Implementando toString para retornar o valor diretamente na classe Lista.
    public String toString() {
        return "Nome: " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;

        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
