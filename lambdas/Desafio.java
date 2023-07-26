package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {


       Function<Produto, Double> precoFinal = prod -> prod.preco * ( 1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPhone 13", 4800, 0.15);

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);

        System.out.println("O preço final é " + preco);
    }
}
