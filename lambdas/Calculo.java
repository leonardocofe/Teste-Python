package lambdas;
@FunctionalInterface
public interface Calculo {

    //Interface funcional só pode receber 1 método abstrato, se tentar colocar outra vai começar a dar erro!!!!
    public abstract double executar(double a, double b);

    default String legal(){
        return "legal";
    }
    static String massa(){
        return "massa";
    }
}
