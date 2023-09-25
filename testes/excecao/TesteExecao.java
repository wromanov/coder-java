package testes.excecao;

public class TesteExecao {
    public static void main(String[] args) {

        double a = 10.0;
        double b = 0.0;

        double resultado = a / b;

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");


    }
}
