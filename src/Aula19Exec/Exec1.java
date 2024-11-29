package Aula19Exec;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[5];
        double[] B = new double[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Entre com o valor da posicao: " + i);
            A[i] = sc.nextDouble();
            B[i] = A[i];
        }

      /*  for (int i = 0; i < A.length; i++){

        }
        System.out.println(B[1]);*/

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("B = ");
        for (int i = 0; i < A.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}