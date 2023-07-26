package colocoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<String>();
        listaAprovados.add("Leo");
        listaAprovados.add("Raquel");
        listaAprovados.add("Adriana");
        listaAprovados.add("João");

        for (String candidato: listaAprovados) {
            System.out.println(candidato);



        }
        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for (int n: nums) {
            System.out.println(n);

        }

    }

}