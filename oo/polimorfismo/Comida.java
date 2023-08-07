package oo.polimorfismo;

public abstract class Comida {

    /* Classe abstrata não pode ser estanciada, serve apenas para uso de herança. */

    double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }


}
