package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public Pessoa(int idade, String nome, String sobrenome){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
    public String toString(){
        return "Olá, meu nome é " +getNome() + " e tenho " +getIdade()+ " anos";
    }
}
