package classe;

public class AreaCirc {
    double raio;

    //Quando usamos o "Static" o atributo passa a ser da classe e não da estância,
    // podendo ser acessado pela notação ponto com nome da classe Ex. AreaCic.PI
    static final double PI = 3.14;

    //Construtor personalizado
        AreaCirc(double raio) {
        this.raio = raio;

    }
    //Método de Estância para calcular area como estância da classe
    double area() {
       return PI * Math.pow(raio, 2);
    }

    //Método da Classe para calcular a area, sem precisar criar estância. 
    static double area(double raio) {
            return PI * Math.pow(raio, 2);
    }

}
