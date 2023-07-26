package oo.heranca.desafio;

public class Carro {
    int velocidade;
    int velocidadeAtual = 0;

    void acelerar(){
        velocidadeAtual += 5;
    }
    void brecar(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }
    public String toString(){
        return "A velocidade atual é de:"  + velocidadeAtual+ "Km";
    }
}
