package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String condicaoSaida;
//
//        System.out.println("Bom dia");
//
//        while (true) {
//            System.out.println("Informe a condição de saída: ");
//            condicaoSaida = sc.nextLine();
//
//            if (condicaoSaida.equalsIgnoreCase("fim")) {
//                break;
//            }
//
//            System.out.println("Bom dia");
//        }


        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {

            System.out.println("Você diz: ");
            valor = sc.nextLine();


        }


        sc.close();

    }
}
