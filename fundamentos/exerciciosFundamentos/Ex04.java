package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        double a, quadrado, cubo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        a = sc.nextDouble();

        quadrado = Math.pow(a, 2);
        cubo = Math.pow(a, 3);

        System.out.printf("Valor de %.2f ao Quadro = ", quadrado);
        System.out.printf("Valor de %.2f ao Cubo = ", cubo);


        sc.close();
    }
}
