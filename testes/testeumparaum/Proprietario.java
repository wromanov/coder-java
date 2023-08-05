package testes.testeumparaum;

public class Proprietario {
    private String nome;
    private int idade;

    Casa casa;

    Proprietario (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        casa = new Casa(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
