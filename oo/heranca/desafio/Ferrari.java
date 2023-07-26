package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
    void acelerar(){
        velocidadeAtual += 15;
    }
    void brecar(){
        if(velocidadeAtual >= 10){
            velocidadeAtual -= 10;
        }else{
            velocidadeAtual = 0;
        }
    }
  public void ligarTurbo(){
        velocidadeAtual += 40;
  }

    @Override
    public void desligarTurbo() {
        velocidadeAtual += 15;
    }
}
