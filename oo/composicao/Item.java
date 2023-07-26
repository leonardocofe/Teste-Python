package oo.composicao;

public class Item {

    public Compra compra;
    String nome;
    int quantidade;
    double preco;

    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
