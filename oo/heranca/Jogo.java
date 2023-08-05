package oo.heranca;

public class Jogo {

    public static void main(String[] args) {


        Heroi monstro = new Heroi();
        monstro.x = 10;
        monstro.y = 10;


        Monstro heroi = new Monstro();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstros tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);





    }


}
