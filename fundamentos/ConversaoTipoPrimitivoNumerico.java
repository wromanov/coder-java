package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Convers�o impl�cita.
        double a = 1;
        System.out.println(a);

        // casting expl�cito, pois por padr�o o interpretador entende valor ponto flutuante como double. (CAST)
        float b = (float) 1.12345678;

        int c = 340;
        byte d = (byte) c; // Cast expl�cita
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Cast Expl�cita
        System.out.println(f);

        double cd = 999.2222;
        int h = (int) cd;
        System.out.println(h);

    }
}
