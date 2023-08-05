package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         //Wrapper permite que a notação "." seja utilizada com os tipos primitivos.

        //Wrapper para tipo byte, veja que começa com letra maiúscula diferente do tipo primitivo.
        Byte b = 100;

        Short s = 1000;

        Integer i = Integer.parseInt(sc.next()); //Recebendo o valor de uma String e convertendo para um valor numérico usando Wrapper

        Long l = 100000L;


        System.out.println(s.shortValue());
        System.out.println(s.toString()); //Convertendo o valor para string.
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 132.3F;
        System.out.println(f.floatValue());

        Double d = 123456.789;
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean("true"); //Convertendo string em boolean
        System.out.println(bo.toString().toUpperCase());// Convertendo boolean em string

        Character c = '#'; // Wrapper tipo char
        System.out.println(c + "...");





        sc.close();






    }
}
