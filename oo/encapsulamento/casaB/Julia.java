package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcesssos() {
        //System.out.println(sogra.segredo); //Atributo Privado
        //System.out.println(sogra.facoDentroDeCasa); //Atributo Default, somente acessível dentro do mesmo pacote.
        //System.out.println(sogra.formaDeFalar); //Atributo Protected somente acessivel via heraça ou dentro do mesmo pacote.
        System.out.println(sogra.todosSabem); //Atributo Publico.
    }


}
