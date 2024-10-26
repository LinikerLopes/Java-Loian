package Aula19Exec;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero de elementos da array: ");
        int num = sc.nextInt();

        int[] A = new int[num];
        double[] B = new double[A.length];

        for(int i=0;i<A.length;i++){
            System.out.println("Digite o numero da array: ");
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length;i++){
            B[i] = sqrt(A[i]);
        }

        forAB foraB = new forAB();
        foraB.exibirArrays(A,B);
    }
}
