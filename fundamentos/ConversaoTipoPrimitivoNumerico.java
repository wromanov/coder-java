package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Conversão implícita.
        double a = 1;
        System.out.println(a);

        // casting explícito, pois por padrão o interpretador entende valor ponto flutuante como double. (CAST)
        float b = (float) 1.12345678;

        int c = 340;
        byte d = (byte) c; // Cast explícita
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Cast Explícita
        System.out.println(f);

        double cd = 999.2222;
        int h = (int) cd;
        System.out.println(h);

    }
}
