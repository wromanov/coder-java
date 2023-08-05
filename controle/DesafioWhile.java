package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double nota = 0, total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota (ou -1 p/sair): ");
            nota = sc.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;

            } else if (nota != -1) {
                System.out.println("Nota Invalida!!!");
            }


        }

        //Calcula Média
        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);

        sc.close();


    }


}
