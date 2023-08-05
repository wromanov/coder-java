package oo.heranca.Desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int fatorAceleracao = 10;
    int fatorFrenagem = 10;

    Carro (int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;

    }


    void acelerar () {
        if (velocidadeAtual + getFatorAceleracao() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += getFatorAceleracao();
        }
    }

    boolean frear () {
        if (CarroEstaParado()) {
             return false;
        }
        else{
            velocidadeAtual -= fatorFrenagem;
            return true;
        }
    }

    boolean CarroEstaParado () {
        if (velocidadeAtual <= 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public int getFatorAceleracao() {
        return fatorAceleracao;
    }

    public void setFatorAceleracao(int fatorAceleracao) {
        this.fatorAceleracao = fatorAceleracao;
    }

    public String toString() {
        return String.format("Sua velocidade atual %s KM/s a Velocidade máxima é %dKM/s.",velocidadeAtual, VELOCIDADE_MAXIMA);
    }

}
