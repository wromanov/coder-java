package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        //String se compara com o Método Equals

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner sc = new Scanner(System.in);

        String s2 = sc.next();
        System.out.println("2" == s2.trim()); //trim usado para remover espaços da string.
        System.out.println("2".equals(s2.trim()));



    }
}
