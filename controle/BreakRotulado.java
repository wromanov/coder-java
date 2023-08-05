package controle;

public class BreakRotulado {
    public static void main(String[] args) {
        externo:
        for (int i = 0; i < 3; i++) { //Rotulando Laço como Interno
            interno:
            for (int j = 0; j < 3; j++) { //Rotulando Laço como Externo
                if (i == 1) {
                    break externo; //Por padrão esse break age em cima do for interno, mas rotulando ele vai agir no laço externo.

                }
                System.out.printf("[%d %d] ", i, j);
            }

            System.out.println();
        }


    }
}
