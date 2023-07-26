package colocoes;


import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Senhor dos Aneis");
        livros.push("Titanic");
        livros.push("Naruto");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros){
            System.out.println(livro);
        }


        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
    }
}
