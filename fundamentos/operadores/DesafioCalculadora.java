package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double a, b, calculo;
        String operador;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número: ");
        a = sc.nextDouble();

        System.out.print("Informe a operação: ");
        operador = sc.next();

        System.out.print("Informe o número: ");
        b = sc.nextDouble();


        calculo = "+".equals(operador) ? a + b : 0;
        calculo = "-".equals(operador) ? a - b : calculo;
        calculo = "*".equals(operador) ? a * b : calculo;
        calculo = "/".equals(operador) ? a / b : calculo;

        sc.close();

        System.out.printf("%.2f %s %.2f = %.2f", a , operador, b, calculo);

    }
}
