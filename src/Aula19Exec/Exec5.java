package Aula19Exec;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de elementos da array: ");
        int num = sc.nextInt();

        int[] A = new int[num];
        int[] B = new int[A.length];

        for(int i = 0 ; i < A.length; i++){
            System.out.println("Digite o numero: ");
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length;i++) {
            B[i] = A[i] * i;
        }

        forAB foraB = new forAB();
        foraB.exibirArray(A,B);
    }
}
