package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultadoFinal = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);

        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
        //Compose faz o sentido contrario de andThen, começando pelo ultimo metodo digitado e indo até o primeiro.

        System.out.println(maisDois.apply(5));
        System.out.println(vezesDois.apply(4));
        System.out.println(aoQuadrado.apply(4));

        System.out.println(resultadoFinal);
        System.out.println(resultado2);

    }
}
