package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, true);
        Aluno a2 = new Aluno("Bia", 7.0, false);
        Aluno a3 = new Aluno("Daniel", 9.2, false);
        Aluno a4 = new Aluno("Gui", 8.5, true);
        Aluno a5 = new Aluno("João", 5.5, true);
        Aluno a6 = new Aluno("Pedro", 6.0, false);

        List<Aluno> alunos  = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> estaAprovado = a -> a.nota >= 7;
        Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " +a.nome+ "! Você foi aprovado(a)";

        alunos.stream().filter(estaAprovado).map(saudacaoAprovado).forEach(System.out::println);
    }
}
