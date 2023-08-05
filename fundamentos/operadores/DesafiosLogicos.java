package fundamentos.operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        Boolean comprouTV50 = trabalho1 && trabalho2;
        Boolean comprouTV30 = trabalho1 ^ trabalho2;
        Boolean tomouSorvete = trabalho1 || trabalho2;
        Boolean naoTomouSorvete = !(trabalho1 || trabalho2);


        if (trabalho1 && trabalho2) {
            System.out.println("Comprou TV de 50\"? " + comprouTV50.toString().replace("true", "Sim.").replace("false", "Não."));

        }

        else if (trabalho1 ^ trabalho2) {
            System.out.println("Comprar TV de 30\" e Tomar Soverte? " + comprouTV30.toString().replace("true", "Sim.").replace("false", "Não."));

        }

        else if (!(trabalho1 || trabalho2)){
            System.out.println("Não vai tomar soverte? " + naoTomouSorvete.toString().replace("true", "Sim.").replace("false", "Não."));
        }


    }



}
