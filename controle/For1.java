package controle;

public class For1 {
    public static void main(String[] args) {

        //Laço for completo
        for (int contador = 0; contador <= 20; contador += 2) {
            System.out.println("bom dia!" + contador);

        }

        //Laço for com os controles fora do for
        int x = 10;
        for (; x < 10; ) {
            System.out.println("x = " + x);
            x++;

        }

        //Laço for infinito

        for (; ; ) {
            System.out.println("x = " + x);

        }
    }
}