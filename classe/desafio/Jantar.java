package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida cm1 = new Comida("Bife", 3);
        Comida cm2 = new Comida("Feijão", 4);
        Pessoa ps1 = new Pessoa("Walace", 83);

        System.out.println(ps1.apresentar());

        ps1.comer(cm1); //Executa método comer
        System.out.println(ps1.apresentar());

        ps1.comer(cm2); //Executa Método comer
        System.out.println(ps1.apresentar());


    }
}
