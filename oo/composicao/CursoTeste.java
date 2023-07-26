package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo");
        Aluno aluno2 = new Aluno("Fernando");
        Aluno aluno3 = new Aluno("Lucas");
        Aluno aluno4 = new Aluno("Felipe");
        Aluno aluno5 = new Aluno("Matheus");


        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("JavaScript ");
        Curso curso3 = new Curso("Python");
        Curso curso4 = new Curso("React Native");
        Curso curso5 = new Curso("Flutter");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);
        curso1.adicionarAluno(aluno4);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno5);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno4);

        curso4.adicionarAluno(aluno1);
        curso4.adicionarAluno(aluno2);
        curso4.adicionarAluno(aluno3);

        curso5.adicionarAluno(aluno2);
        curso5.adicionarAluno(aluno4);
        curso5.adicionarAluno(aluno5);

        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso de  " + curso3.nome + "...");
            System.out.println("...e meu nome é " + aluno.nome);
        }
        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("React Native");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
