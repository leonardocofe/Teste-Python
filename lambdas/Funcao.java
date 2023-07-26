package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(30));

        Function<String, String> oResultadoE = valor -> "O  resultado é: " +valor;

        Function<String, String> empolgado = valor -> valor + " !!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(25);
        //andThen primeiro chama a função inicial par ou impar, depois, aciona uma segunda função a sua escolha e as executam juntas!!

        System.out.println(resultadoFinal);
    }
}
