package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }


    void comer(Comida comida) { //Recebe um objeto como parâmetro para o método
        if (comida != null) {
            this.peso += comida.peso;
        }

    }

    String apresentar() {
        return String.format("Olá meu nome é " + nome + " e meu peso é " + peso + " Kg.");
    }


}
