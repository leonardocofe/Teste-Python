package arrays;

public class Equals {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        Equals outro = (Equals) objeto;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;


    }
}