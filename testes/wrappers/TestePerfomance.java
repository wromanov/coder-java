package testes.wrappers;

public class TestePerfomance {
    public static void main(String[] args) {

        long tempoInicio = System.currentTimeMillis();

        Long soma = 0L;

        for (int i = 0; i < Integer.MAX_VALUE ; i++) {
            soma += i;
        }

        System.out.println(soma);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;

        System.out.println(duracao);

    }



}
