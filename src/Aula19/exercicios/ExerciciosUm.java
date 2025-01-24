package Aula19.exercicios;

import java.util.Scanner;

public class ExerciciosUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de elementos da array:");
        int vezes = sc.nextInt();

        int[] A = new int[vezes];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("A = " + i);
                A[i] = sc.nextInt();

                    B[i] = A[i] * A[i];
        }
        for (int i = 0; i < A.length; i++){
            System.out.print("A = " + A[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < B.length; i++){
            System.out.print("B = " + B[i]);
            System.out.print(" ");
        }

    }
}
