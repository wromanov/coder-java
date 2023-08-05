package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media;

        System.out.print("Informe a média: ");
        media = sc.nextDouble();


        if (media >= 7 && media <=10) {
            System.out.println("Aprovado");
        }

        if (media >= 4.5 && media < 7) {
            System.out.println("Recuperação");
        }

        boolean creterioreprovacaoAtingido = media < 4.5 && media >=0;

        if (creterioreprovacaoAtingido) {
            System.out.println("Reprovado");
        }





        sc.close();





    }
}
