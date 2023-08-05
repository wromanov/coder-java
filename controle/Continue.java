package controle;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue; //Pula a iteração e vai para próxima
            }
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //Pula a iteração e vai para próxima
            }
            System.out.println(i);
        }



    }
}
