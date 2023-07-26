package arrays;

import java.util.Arrays;

public class ExerciciosForeach {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 6.50;
        notasAlunoA[1] = 8.30;
        notasAlunoA[2] = 5.00;
        notasAlunoA[3] = 5.50;


        System.out.println(Arrays.toString(notasAlunoA));

        for (double nota: notasAlunoA) {
            System.out.println(nota / notasAlunoA.length);
        }
        double[] notasAlunoB = {6.9, 8.0, 5.45, 4.90};

        for (double nota: notasAlunoB) {
            System.out.println(nota / notasAlunoB.length);
        }

    }
}

