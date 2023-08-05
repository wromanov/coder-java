package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        /* Podemos declar uma variavel do tipo VAR e deixar o java decidir qual tipo de varialvel será,
        levando em consideração valor contido na variavel. */

        var a = 10; // Inferencia tipo INT
        var b = 10.1; // Inferência tipo Double
        var c = "Walace"; // Inferencia tipo String
        var d = false; // Inferência tipo boolean
        var e = 'A'; // Inferencia tipo Char

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }


}
