package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    //Transformando o construtor em privado, já que todos os métodos são static, não precisamos stanciar essa classe.
    private Utilitarios() {
    }

    public static final UnaryOperator<String> transformaEmMaiuscula = n -> n.toUpperCase();
    public static final UnaryOperator<String> getPrimeiraLetra = n -> n.charAt(0) + "";
    public static final String grito(String n) {
        return n + "!!! ";
    }
}
