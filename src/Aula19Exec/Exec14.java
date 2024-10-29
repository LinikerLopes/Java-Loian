package Aula19Exec;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 1;
        int num = sc.nextInt();
        int[] A = new int[num];

        for(int i = 0; i < A.length;i++){
            System.out.println("Digite um valor:  ");
            A[i] = sc.nextInt();
            soma *= A[i];
        }
        System.out.println(soma);

    }
}
