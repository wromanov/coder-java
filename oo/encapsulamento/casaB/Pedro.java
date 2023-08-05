package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcesssos() {
        //System.out.println(segredo); //Atributo Privado
        //System.out.println(facoDentroDeCasa); //Atributo Default, não transmitido por herança.
        System.out.println(formaDeFalar); // Atributo acesso via herança // Atributo Protected
        System.out.println(todosSabem); // Atributo acesso via herança // Atributo Public
    }



}
