package Aula20Exec;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mesa = new int[3][3];

        for(int i = 0; i < mesa.length; i++){
            for (int j = 0; j < mesa[i].length; j++){
                System.out.println("Digite um numero: ");
                mesa[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mesa.length;i++){
            for ( int j = 0; j < mesa[i].length; j++){
                System.out.print(mesa[i][j] + " - ");
            }
            System.out.println();
        }
        int par = 0;
        int impar = 0;
        for (int i = 0; i < mesa.length; i++){
            for (int j = 0; j < mesa[i]. length; j++){
                if(mesa[i][j] % 2 == 0){
                    par++;
                }
                else{
                    impar++;
                }
            }
        }
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}
