package Aula19.exercicios;

import java.util.Scanner;

public class ExerciciosUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vezes = sc.nextInt();

        int[] A = new int[vezes];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("A = " + i);
                int numeros = sc.nextInt();

                    B[i] = A[i];
        }

    }
}
