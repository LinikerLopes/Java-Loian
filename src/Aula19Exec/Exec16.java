package Aula19Exec;

import java.util.Scanner;

public class Exec16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int somaMenor = 0;
        int somaIgual = 0;
        int somaMaior = 0;


        double[] A = new double[num];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o valor: ");
            A[i] = sc.nextInt();

        if(A[i] < 15){
            somaMenor+= A[i];
        }else if(A[i] == 15){
            somaIgual+= A[i];
        } else if (A[i] > 15) {
            somaMaior+= A[i];

        }

    }

        System.out.println(somaMenor);
        System.out.println(somaIgual);
        System.out.println(somaMaior);

}
}
