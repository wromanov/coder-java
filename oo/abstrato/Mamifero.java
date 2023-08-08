package oo.abstrato;

public abstract class Mamifero extends Animal {

//    @Override
//    public String mover() {
//        return "Usando as patas";
//    }

    public abstract String mamar();


    //Quando usado o "Final" o método "mover()" não poderá se sobrescrito nas subclasses.
    @Override
    public final String mover() {
        return "Saindo do lugar.";
    }



}

