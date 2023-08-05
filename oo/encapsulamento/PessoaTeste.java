package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Walace", "Delgado",-30);

    p1.setNome("Walace");

    p1.setIdade(-50);

    System.out.println(p1.getNomeCompleto());
    System.out.println(p1);


    }


}
