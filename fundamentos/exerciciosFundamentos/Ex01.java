package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        double fahrenheit, calculo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor em Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        calculo = (fahrenheit - 32) * 5/9;

        System.out.printf("Valor convertido para Celsius: %.2f°C", calculo);






    }
}
