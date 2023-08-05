package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer num1 = 1000;

        //m�todo 1 - Convertendo n�mero para string
        System.out.println(num1.toString().length());

        //m�todo 2 - Convertendo n�mero para string
        int num2 = 2000;
        System.out.println(Integer.toString(num2).length());

        //m�todo 3 - n�o interessante - Converter um n�mero para String concatenando com uma string vazia
        int num3 = 33;
        System.out.println(("" + 33).length());

    }
}
