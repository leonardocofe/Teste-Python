package oo.heranca;

public class Heroi extends  Jogador {

    boolean atacar(Jogador openente) {
        int deltaX = Math.abs(x - openente.x);
        int deltaY = Math.abs(y - openente.y);

        if (deltaX == 0 && deltaY == 1) {
            openente.vida -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            openente.vida -= 20;
            return true;
        } else {
            return false;
        }

    }
}

