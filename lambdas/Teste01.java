package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {
        List<String> teste = new ArrayList<>();
        teste.add("Leonardo");
        teste.add("João");
        teste.add("Adriana");
        teste.add("Raquel");
        teste.add("Biaa");
        teste.add("Ana");
        teste.add("Carlos");

        System.out.println("Lista de confirmados para o almoço: ");
        teste.forEach(System.out::println);
    }
}
