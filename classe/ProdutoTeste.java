package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 5000);
        System.out.println(p1.precoComDesconto());

        // Natal o gerente deu 10% a mais de desconto
        //Produto.desconto = 0.50 muda diretamente o valor do produto

        Produto p2 = new Produto("IPhone", 5000);
        System.out.println(p2.precoComDesconto(0.10));
    }
}
