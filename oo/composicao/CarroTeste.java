package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println("Carro está ligado: " + c1.estaLigado());

        c1.desligar();
        //c1.desligar();

        System.out.println("Carro está ligado: " + c1.estaLigado());

        System.out.println("Giros do Motor: " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Giros do Motor: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Giros do Motor: " + c1.motor.giros());

        //Faltou Encapsulamento!!!
        //c1.motor.fatorInjecao = -30;


        //Relação Bidirecional - Encadeamento
        System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());



    }
}
