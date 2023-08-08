package oo.heranca.Desafio;

public interface Esportivo {

    /* Por padrão todos os métodos dentro de uma interface são abstratos (não tem corpo) e seu
    *  nível de visibilidade é público.*/

    void ligarTurbo();
    void desligarTurbo();

    /* Método default deixa a critério usar o valor padrão do método ou sobrescrevê-lo,
    como se fosse um método opcional dentro de uma interface, já que os métodos que não são
    default precisam ser implementados. */
    default int velocidadeAr() {
        return 1;
    }




}
