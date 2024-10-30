package Aula19Exec;

import java.util.Scanner;

public class Exec12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos A: ");
            int num = sc.nextInt();

            int[] A = new int[num];


            for (int i = 0; i < A.length; i++){
                A[i] = sc.nextInt();
            }
            int soma = 0;
            for(int i = 0; i < A.length; i++){
                soma += A[i];
            }
            System.out.println("Soma = " + soma);



    }

}
