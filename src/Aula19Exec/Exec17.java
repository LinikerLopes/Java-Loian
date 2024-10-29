package Aula19Exec;

import java.util.Scanner;

public class Exec17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int maior = 0;
        int[] A = new int[num];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um valor: ");
            A[i] = sc.nextInt();

            if(A[i] > 35){
                maior++;
            }
        }

        System.out.println("Pessoas com mais de 35 são: " + maior);

    }
}
