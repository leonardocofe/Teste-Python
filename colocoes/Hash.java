package colocoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Leonardo"));
        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Adriana"));
        usuarios.add(new Usuario("Jefferson"));

        boolean resultado = usuarios.contains(new Usuario("Leonardo"));
        System.out.println(resultado);

    }
}
