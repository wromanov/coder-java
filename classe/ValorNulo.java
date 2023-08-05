package classe;

public class ValorNulo {
    public static void main(String[] args) {


        String s1 = ""; //String Vazia é Diferente de valor NULL
        System.out.println(s1.concat("!!!!"));

        /*Quando uma string é iniciada com valor NULL, quer dizer que ele não está apontando para um endereço
         * de memória, não sendo possível realizar modificações nessa String. */

        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null) {
            d1.mes = 3;
            System.out.println(d1.DataFormatada());
        }

        String s2 = Math.random() > 0.5 ? "Opa" : null;
        if (s2 != null) {
            System.out.println(s2.concat("!!!!"));

        }

    }
}
