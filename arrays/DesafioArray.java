package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        int qntDeNotas = entrada.nextInt();
        System.out.println(qntDeNotas);

        double notas[] = new double[qntDeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notas));

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A média é " + media + "!!");

        if(media >= 7){
            System.out.println("Você foi APROVADO!!!");
        }if(media < 7 && media >= 5.50){
            System.out.println("Você está de recuperação!!!");
        }else{
            System.out.println("Você está REPROVADO!!!");
        }


        entrada.close();
    }
}
