package oo.encapsulamento.casaA;

public class Ana {

    private String segredo = "..."; //Somente a classe tem visbilidade
    String facoDentroDeCasa = "..."; //Somente o pacote tem visibilidade (default)
    protected String formaDeFalar = "..."; //Transmitido via herança para outras classes ou se tiver no mesmo pacote.
    public String todosSabem = "..."; //Todos as classes tem visibilidade, independente se está ou não no mesmo pacote.






}
