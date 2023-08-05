package testes.testeumparaum;

public class Interface {

    public static void main(String[] args) {


        Proprietario p1 = new Proprietario("Walace", 33);

        p1.setNome("Walace");
        p1.setIdade(33);

        p1.casa.setNome("AV AMERICA");
        p1.casa.setTamanho(365);

        System.out.println(p1.casa.getNome());
        System.out.println(p1.casa.getTamanho());


    }


}
