package oo.heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;


   /* O construtor padrão, conforme exemplo abaixo, chama o construtor da classe Pai "Carro". */
    //Ferrari () {
    //super();
    //}

    Ferrari (int VELOCIDADE_MAXIMA) {
        //Chama o construtor da classe pai "Carro".
        super(VELOCIDADE_MAXIMA);
        setFatorAceleracao(15);
    }


    @Override
    public void ligarTurbo() {
        ligarTurbo = true;

    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;

    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getFatorAceleracao() {
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }else {
            return 15;
        }

    }
}
