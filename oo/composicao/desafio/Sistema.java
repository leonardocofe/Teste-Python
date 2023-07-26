package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leonardo Correa Ferreira");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.50, 20);
        compra1.adicionarItem(new Produto("Caderno", 15.80), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Picanha", 70, 2);
        compra2.adicionarItem(new Produto("Linguiça", 30), 3);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
