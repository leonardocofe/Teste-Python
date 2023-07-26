package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void testeAcesso() {
     //   System.out.println(sogra.segredo); // Privado não é transmitido
     //   System.out.println(sogra.facoDentroDeCasa); // default ou pacote só é transmitido dentro do pacote
     //   System.out.println(sogra.formaDeFalar); // Protected só é transmitido se estiver no mesmo pacote ou transmitido por herança
        System.out.println(sogra.todosSabem);
    }
}
