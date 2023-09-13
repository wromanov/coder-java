package streams;

public class Media {

    private double total;
    private int quantidade;

    //O retorno da função é a propria estância da classe, retornando ela mesmo, possibilitando a chamada da mesma função de forma encadeada.
    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinarMedia(Media m1, Media m2){
        Media resultante = new Media();
        resultante.quantidade = m1.quantidade + m2.quantidade;
        resultante.total = m1.total + m2.total;
        return resultante;
    }


}
