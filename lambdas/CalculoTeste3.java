package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        //NÃO PERMITE: int -> Double
        //double -> Double é o correto

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0,3.0));

        calc = (x,y) -> x * y; //Sem chaves, automaticamente será retornado na função
        System.out.println(calc.apply(2.0,5.0));

        BinaryOperator<Integer> calc2 = (x,y) -> {return x +y; };
        System.out.println(calc2.apply(2,4));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(4,6));


    }
}
