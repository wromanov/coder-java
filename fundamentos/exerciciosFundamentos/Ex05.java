package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double area, base, altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base do triangulo: ");
        base = sc.nextDouble();

        System.out.print("Informe o valor da altura do triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("Área do triangulo = %.2f", area);


        sc.close();

    }
}
