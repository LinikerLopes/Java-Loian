package Aula19.exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantas numeros quer inserir na array? ");
        int num = sc.nextInt();
        int[] A = new int[num];
        int[] B = new int[A.length];

        for(int i =0; i < A.length; i++) {
            System.out.println("Escreva o " + (i + 1) + " numero: ");
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            System.out.print("A = " + A[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < B.length; i++){
            B[i] = A[i] * (i+1);
            System.out.print("B = " + B[i] + " ");}
    }
}
