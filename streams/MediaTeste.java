package streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media();
        Media m2 = new Media();


        //Forma tradicional
        m1.adicionar(10.0);
        m1.adicionar(9.0);

        System.out.println("Resultado M1: " + m1.getValor());

        //Forma encadeada, só possível porque o método retorna a estância da própria classe.
        System.out.println("Resutado M2: " + m2.adicionar(10.8).adicionar(6.2).adicionar(8.2).getValor());


        System.out.println(Media.combinarMedia(m1, m2).getValor());


    }
}
