package oo.encapsulamento;

public class Pessoa {
   private String nome;

   public String getSobreNome() {
        return sobreNome;
    }

   public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

   private String sobreNome;
   private int idade;


   Pessoa(String nome, String sobreNome, int idade) {
       setNome(nome);
       setSobreNome(sobreNome);
       setIdade(idade); //Usando um método da classe no construtor.
   }

    public String getNome() {
        return nome;
    }

    public String getNomeCompleto() {
       return nome + " " + sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método Getter
   public int getIdade(){
       return idade;
    }

    //Método Setter
    public void setIdade(int novaIdade) {

        novaIdade = Math.abs(novaIdade);

        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }

    }

    @Override
    public String toString() {
        return "Ola meu nome e " + nome + " e minha idade e " + idade + " anos.";
    }
}
