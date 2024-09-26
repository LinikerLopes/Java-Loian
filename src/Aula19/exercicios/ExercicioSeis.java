package Aula19.exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total de numeros dentro da : ");
            int num = sc.nextInt();
                int[] A = new int[num];
                int[] B = new int[A.length];
                int []C = new int[A.length];

        for(int i =0; i < A.length; i++) {
            System.out.println("Escreva o " + (i + 1) + " numero de A: ");
            A[i] = sc.nextInt();
        }

        for(int i =0; i < B.length; i++) {
            System.out.println("Escreva o " + (i + 1) + " numero de B: ");
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            System.out.print("A = " + A[i] + " . ");
        }
        System.out.println();
        for(int i = 0; i < B.length; i++){
            System.out.print("B = " + B[i] + " . ");
        }
        System.out.println();
        for(int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
            System.out.print("C = " + C[i] + " . ");
        }
    }
}
