package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.adicionarItem("Caneta", 20, 7.50);
        c1.itens.add(new Item("Borracha", 12, 3.90));
        c1.itens.add(new Item("Caderno", 3 , 15.90));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
