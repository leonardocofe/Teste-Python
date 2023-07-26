package oo.heranca.desafio;

public class Civic extends Carro{
    void acelerar(){
        velocidadeAtual += 10;
    }
    void brecar(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
}
