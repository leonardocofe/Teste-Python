package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoExpection  extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroNegativoExpection(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    public String getMessage(){
        return String.format("O Atributo %s está negativo", nomeDoAtributo);
    }
}
