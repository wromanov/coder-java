package controle;

import java.util.Scanner;

public class DesafioDaSemana {
    public static void main(String[] args) {

    String diaSemana;

    Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        diaSemana = sc.next();

        if (diaSemana.equals("segunda")) {
            System.out.println("Segunda-Feira - 1º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("terça")) {
            System.out.println("Terça-Feira - 2º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("Quarta-Feira - 3º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("Quinta-Feira - 4º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Sexta-Feira - 5º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("sabado")) {
            System.out.println("Sabado - 6º dia da Semana.");
        }
        else if (diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("Domingo - 7º dia da Semana.");
        } else {
            System.out.println("Dia Inválido!");
        }


        sc.close();
    }
}
