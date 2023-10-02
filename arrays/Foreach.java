package arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {9.9, 8.7, 7.2 , 9.4};

        //Percorrendo Array de forma tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");

        }
        System.out.println();

        //Percorrendo Array com "Foreach" - Cada interação a variável "nota" recebe o valor de uma posição do Array "notas".
        for (double nota: notas){
            System.out.print(nota + " ");
        }
        System.out.println("Wll come duk's ");
    }
}
