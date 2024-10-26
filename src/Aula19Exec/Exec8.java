package Aula19Exec;

import java.util.Scanner;

public class Exec8 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] A = new int[num];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

            for(int i = 0; i < A.length; i++){
                System.out.println("Digite o numero: ");
                A[i] = sc.nextInt();
            }
            for(int i = 0; i < A.length; i++){
                System.out.println("Digite o numero: ");
                B[i] = sc.nextInt();
            }
            for(int i = 0; i < A.length; i++){
                C[i] = A[i] * B[i];
            }

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.print("C = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(C[i] + " ");
        }



    }
}
