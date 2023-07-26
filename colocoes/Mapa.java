package colocoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Leonardo");
        usuarios.put(2, "João");
        usuarios.put(3, "Adriana");
        usuarios.put(4, "Antonio");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String valor : usuarios.values()){
            System.out.println(valor);
        }
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
