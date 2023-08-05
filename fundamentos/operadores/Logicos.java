package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 4; //false

        System.out.println(condicao1 && condicao2); //Operador AND.
        System.out.println(condicao1 || condicao2); //Operador OU.
        System.out.println(condicao1 ^ condicao2); //Operador OU Exclusivo.
        System.out.println(!condicao1); //Operador Negação.
        System.out.println(!condicao2); //Operador Negação.

        //TABELA VERDADE
        System.out.println("\nTabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false );

        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);



    }
}
