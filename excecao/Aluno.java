package excecao;

import java.util.Objects;

public class Aluno {
   public final String nome;
   public final double nota;
   public final boolean bomComportamento;

    public Aluno(String nome, double nota, boolean bomComportamento){
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
    public Aluno(String nome, double nota){
        this(nome, nota, true);

    }
    public String toString(){
        return nome + " tem nota " + nota;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && bomComportamento == aluno.bomComportamento && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
