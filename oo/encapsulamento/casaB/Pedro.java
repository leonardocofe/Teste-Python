package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
     //Ana mae = new Ana();
    //Não preciso estanciar Ana, pois eu recebi tudo por herança, logo posso chamar o metodo sozinho!!!!

    void testeAcessos(){
      //  System.out.println(segredo); // Privado, não é transmitido por herança
      //  System.out.println(facoDentroDeCasa); //default ou pacote só está disponível para quem está no mesmo pacote!
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
