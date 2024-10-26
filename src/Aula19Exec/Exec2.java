package Aula19Exec;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o numero: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i]);
        }
    }
}