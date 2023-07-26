package oo.heranca.desafio;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Dirigir {
    public static void main(String[] args) {
        Civic civic = new Civic();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.brecar();
        civic.brecar();

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.brecar();

        System.out.println(ferrari.toString());
        System.out.println(civic.toString());
    }
}
