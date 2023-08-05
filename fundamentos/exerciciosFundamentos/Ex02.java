package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner sc = new Scanner(System.in);
        double celsius, calculo;

        System.out.print("Informe o valor em Celsius: ");
        celsius = sc.nextDouble();

        calculo = (celsius * 9/5) +32;

        System.out.printf("Temperatura convertida para Fahrenheint: %.2f°F", calculo);

    }
}
