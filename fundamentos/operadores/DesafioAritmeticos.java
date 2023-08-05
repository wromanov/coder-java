package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double operacao1;
        double operacao2;
        double resolucao;

        operacao1 = Math.pow(6 *(3 + 2), 2) / (3 * 2);
        operacao2 = Math.pow((double) ((1 - 5) * (2 - 7)) / 2, 2);
        resolucao =  (Math.pow(operacao1 - operacao2, 3)) / Math.pow(10,3);

        System.out.println(operacao1);
        System.out.println(operacao2);
        System.out.println(resolucao);

    }
}
