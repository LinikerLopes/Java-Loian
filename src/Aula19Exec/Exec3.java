package Aula19Exec;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de elementos da array A: ");
        int num = sc.nextInt();

        int[] A = new int[num];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um numero: ");
            A[i] = sc.nextInt();
        }

        for(int i = 0; i<A.length;i++){
            B[i] = A[i] * A[i];
        }

        /*System.out.print("A = ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("B = ");
        for (int i = 0; i < A.length; i++){
            System.out.print(B[i] + " ");
        }*/

//Orientacao a Objeto
   forAB foraB = new forAB();
        foraB.exibirArray(A,B);


    }
}
