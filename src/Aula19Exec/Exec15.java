package Aula19Exec;

import java.util.Scanner;

public class Exec15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double par = 0;
        double impar = 0;
        double percentual = 100;


        double[] A = new double[num];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o valor: ");
            A[i] = sc.nextInt();

            if(A[i] % 2 != 0){
                impar++;
            }else{
                par++;
            }
        }
            double somaImp = impar / num * percentual;
            double somaPar = par / num * percentual;

        System.out.printf("Porcentagem de numeros impares na array: %.2f\n",somaImp);
        System.out.printf("Porcentagem de numeros pares na array: %.2f\n",somaPar);
    }
}
