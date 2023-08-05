package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        //d1.ano = 2023;
        //d1.mes = 03;
        //d1.dia = 15;

        Data d2 = new Data(20, 02, 1990);
        //d2.ano = 2022;
        //d2.mes = 02;
        //d2.dia = 20;

        //System.out.printf("Data: %d/%02d/%d\n", d1.dia, d1.mes, d1.ano); //Zero-padding utilizado para exibir zero a esquerda.
        System.out.print("Data: " + d1.DataFormatada());
        System.out.print("Data: " + d2.DataFormatada());


    }

}
