package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura,2);

        System.out.printf("Seu IMC = %.2f.",imc);





    }
}
