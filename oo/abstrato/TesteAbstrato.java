package oo.abstrato;

public class TesteAbstrato {

    //https://pt.stackoverflow.com/questions/193193/qual-%C3%A9-a-diferen%C3%A7a-entre-as-keywords-extends-e-implements-em-java
    public static void main(String[] args) {

        Mamifero a = new Cachorro();

        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());


    }


}
