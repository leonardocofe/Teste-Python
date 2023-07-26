package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (x,y) -> { return x + y; };
        System.out.println(calc.executar(2,3));

        calc = (x,y) -> x * y; //Sem chaves, automaticamente será retornado na função
        System.out.println(calc.executar(2,1));

        System.out.println(calc.legal());
        System.out.println(Calculo.massa());

    }
}
