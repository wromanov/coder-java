package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer num1 = 1000;

        //método 1 - Convertendo número para string
        System.out.println(num1.toString().length());

        //método 2 - Convertendo número para string
        int num2 = 2000;
        System.out.println(Integer.toString(num2).length());

        //método 3 - não interessante - Converter um número para String concatenando com uma string vazia
        int num3 = 33;
        System.out.println(("" + 33).length());

    }
}
