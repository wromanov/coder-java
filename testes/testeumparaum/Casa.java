package testes.testeumparaum;

public class Casa {
    private String nome;
    private int tamanho;

    Proprietario proprietario;

    Casa (Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
