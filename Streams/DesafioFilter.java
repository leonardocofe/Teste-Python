package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produtos p1 = new Produtos ("Nike Pegasus 39", 1000, 0.50,0);
        Produtos p2 = new Produtos ("Fila Racer T2", 500, 0.20,60);
        Produtos p3 = new Produtos ("Nike React Infinity Run", 800, 0.30,0);
        Produtos p4 = new Produtos ("Asics Nova Blast", 900, 0.10,0);
        Produtos p5 = new Produtos ("Fila KR5", 500, 0.40,60);

        List<Produtos> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        Predicate<Produtos> superPromocao = p -> p.desconto >= 0.30;
        Predicate<Produtos> freteGratis = p -> p.frete == 0;
        Predicate<Produtos> produtoRelevante = p -> p.preco >= 800;
        Function<Produtos, String> chamadaPromocional = p -> "Aproveite! " +p.nome+ " por R$" +p.preco;
        produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(System.out::println);
    }
} 