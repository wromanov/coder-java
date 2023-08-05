package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        int qtd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        qtd = sc.nextInt();

        //Criando Array
        double [] notas = new double[qtd];

        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe o valor da %dº nota: ", (i+1));
            notas[i] = sc.nextInt();
            //total += notas[i]; //somando notas
        }

        //somar notas
        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }

        //Calcular Média
        double media = soma / notas.length;

        System.out.println("Media das Notas: " + media);

        sc.close();

    }
}
