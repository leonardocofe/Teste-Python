package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Iphone13", 4500,0.10);
        imprimir.accept(p1);

        Produto p2 = new Produto("Iphone11", 2800,0.10);
        Produto p3 = new Produto("Iphone12", 3500,0.10);
        Produto p4 = new Produto("Iphone14", 5000,0.20);
        Produto p5 = new Produto("Iphone14 PRO MAX", 5800,0.22);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
