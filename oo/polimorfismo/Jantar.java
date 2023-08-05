package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz arroz = new Arroz(0.1);
        Feijao feijao = new Feijao(0.1);
        Sorvete sorvete = new Sorvete(0.1);

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);


        System.out.printf("Peso do convidado: %.2f KG", convidado.getPeso());


    }
}
