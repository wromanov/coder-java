package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String conceito = "";


        System.out.print("Informe a nota: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 10 : case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;

            case 7:
                conceito = "C";
                break;

            default:
                conceito = "Não encontrado";
        }

        System.out.println("Conceito é " + conceito + ".");


        sc.close();



    }
}
