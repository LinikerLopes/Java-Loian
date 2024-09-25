package Aula19.exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas numeros quer colocar na array?");
        int vezes = sc.nextInt();

        int[] A = new int[vezes];
        int[] B = new int[A.length];

        for(int i =0; i < A.length; i++){
            System.out.println("Escreva o " + (i+1) + " numero: ");
            A[i] = sc.nextInt();
                B[i] = A[i] * A[i];
        }
        System.out.print("A = ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("B = ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }

    }

}

