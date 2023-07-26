package oo.heranca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    boolean atacar(Jogador openente){
        int deltaX = Math.abs(x - openente.x);
        int deltaY = Math.abs(y - openente.y);

        if(deltaX == 0 && deltaY == 1){
            openente.vida -= 10;
            return true;
        }else if(deltaX == 1 && deltaY == 0){
            openente.vida -= 10;
            return true;
        }else {
            return false;
        }



    }

    boolean andar(Direcao direcao){
        switch (direcao) {
            case NORTE:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y--;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
