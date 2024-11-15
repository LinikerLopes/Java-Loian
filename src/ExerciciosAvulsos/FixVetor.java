package ExerciciosAvulsos;

import java.util.Scanner;

public class FixVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero inteiro ate 10:");
        int num = sc.nextInt();

        int[] numeros = new int[num];


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

    }
}
