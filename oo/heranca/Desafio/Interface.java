package oo.heranca.Desafio;

public class Interface {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(300);
        Civic civic = new Civic(300);


        ferrari.ligarTurbo();
        //ferrari.ligarAr();

        ferrari.acelerar();
        System.out.println("Carro Ferrari Acelerando: " + ferrari);

        ferrari.acelerar();
        System.out.println("Carro Ferrari Acelerando: " + ferrari);

        ferrari.acelerar();
        System.out.println("Carro Ferrari Acelerando: " + ferrari);

        ferrari.frear();
        System.out.println("Carro Ferrari Freiando: " + ferrari);

        ferrari.frear();
        System.out.println("Carro Ferrari Freiando: " + ferrari);

        ferrari.frear();
        System.out.println("Carro Ferrari Freiando: " + ferrari);

//        civic.acelerar();
//        System.out.println("Carro CIVIC: " + civic);
//
//        civic.acelerar();
//        System.out.println("Carro CIVIC: "  + civic);
//
//        civic.frear();
//        System.out.println("Carro Ferrari: " + civic);


    }


}
