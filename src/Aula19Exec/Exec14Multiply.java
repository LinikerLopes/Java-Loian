package Aula19Exec;

import java.util.Scanner;

public class Exec14Multiply {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            int impar = 0;
            int numImpar = 0;
            int par = 0;
        int[] A = new int[num];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o valor: ");
            A[i] = sc.nextInt();

                if(A[i] % 2 != 0){
                    impar += A[i];
                    numImpar++;
                } else{
                    par++;
                }
        }
            int media = impar / numImpar;
        System.out.println(media);



    }
}
