package arrays;

public class EqualsTeste {
    public static void main(String[] args) {
        Equals p1 = new Equals();
        p1.nome = "Leonardo";
        p1.email = "leonardocofe04@gmail.com";

        Equals p2 = new Equals();
        p2.nome = "Leonardo";
        p2.email = "leonardocofe04@gmail.com";

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

    }

}