package testes.calculoTerreno;

public class TestesPrimitivos {
    public static void main(String[] args) {

        long velocidade = 0L;
        int acelerar = 1000000;
        while (velocidade <= 100_000_000_000_000L) {
            System.out.println("Velocidade Atual " + velocidade);
            velocidade += acelerar;
        }






    }
}
