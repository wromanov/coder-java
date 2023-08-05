package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcesssos() {
        //System.out.println(esposa.segredo); //Atributo Privado
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }


}
