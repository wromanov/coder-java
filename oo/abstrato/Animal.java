package oo.abstrato;

public abstract class Animal {

    /* Usamos a classe abstrata quando temos uma classe tão genérica, que não conseguimos finalizar
    o algoritmo de um método, assim deixando a implementação para quem herdar esse método por herança.*/

    //Uma classe abstrata não pode ser estanciada, apenas estendida para outra classe por meio de herança.

    //Uma classe abstrata pode conter métodos concretos e abstratos, é como se fosse uma classe inacabada.

    public String respirar() {
        return "Respirando Oxigênio.";
    }

    //Só é possível ter método abstrato em classe abstrata


    public abstract String mover(); //Método abstrato não tem corpo.

    /* Classe abstrata não pode ser estanciada, serve apenas para uso de herança. */


}
