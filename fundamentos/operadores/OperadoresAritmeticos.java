package fundamentos.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b); //Cast na variavel b para tipo double.
        System.out.println(a / (float) b); //Cast na variavel b para tipo float.

        System.out.println(a % b);
        System.out.println(8 % 3);

        System.out.println(x + y - a * b);
    }

}
