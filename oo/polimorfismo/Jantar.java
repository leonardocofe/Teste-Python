package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
    Pessoa convidado = new Pessoa(88.50);

    Arroz arroz = new Arroz(0.25);
    Feijao feijao = new Feijao(0.15);
    Sorvete sorvete = new Sorvete(0.2);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());



    }
}
