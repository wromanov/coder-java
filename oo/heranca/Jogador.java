package oo.heranca;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if ((deltaX == 0 && deltaY == 1) || (deltaY == 0 && deltaX == 1)){
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }

    }


    boolean andar(Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            y--;
        } else if (direcao == Direcao.LESTE) {
            x++;
        } else if (direcao == Direcao.SUL) {
            y++;
        } else if (direcao == Direcao.OESTE) {
            x--;
        }
        return true;
    }


}
