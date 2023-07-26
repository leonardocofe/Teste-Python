package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.0,4.2));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 6 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(6.0,5.8));

        Function<Double,String> conceito = m -> m >= 6 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(5.6,6.8));
    }
}
