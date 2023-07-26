package colocoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Leonardo");
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Adriana"));
        lista.add(new Usuario("Raquel"));
        lista.add(new Usuario("Fernando"));
        lista.add(new Usuario("Ana"));

       System.out.println(lista.get(3)); // Acessar pelo índice

        System.out.println(">>>>>" + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Fernando")));

        System.out.println(lista.contains(new Usuario("Leonardo")));

        for (Usuario u: lista){
            System.out.println(u);
        }

    }
}
