package classe;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Pão", 0.200);
        Comida c2 = new Comida("Hamburguer", 0.350);
        Comida c3 = new Comida("Batata frita", 0.500);
        Comida c4 = new Comida("Refrigerante", 0.350);

        Pessoa p1 = new Pessoa("Leonardo", 88);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);
        p1.comer(c4);


        System.out.println(p1.apresentar());
    }
}
