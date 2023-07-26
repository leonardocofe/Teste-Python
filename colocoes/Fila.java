package colocoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        //Offer e Add -> Adicionam elementos na fila
        //Diferença é o comportamento quando a fila está cheia!!
        fila.add("Ana");
        fila.offer("João");
        fila.offer("Carlos");
        fila.add("Roberta");
        fila.offer("Daniel");
        fila.add("Rafaela");

        //Diferença é o comportamento, ocorre quando a fila está vazia!
        //Peek e Element -> obter o próximo elemento da fila (sem remover)
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.element()); // Lança um exceção

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains();

        //Pool e Remove -> obter o próximo elemento da fila e remove!

        //Diferença é o comportamento, ocorre quando a fila está vazia!
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
