package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
    Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 4000;
    Produto produto = new Produto("IPhone 13", 4000,0.10);
        System.out.println(isCaro.test(produto));

    }
}
