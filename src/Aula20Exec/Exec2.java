package Aula20Exec;

import java.util.Random;

public class Exec2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] m = new int[6][6];

        for(int i = 0; i< m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = random.nextInt(10);
                System.out.print(m[i][j] + " / ");
            }

        }
        System.out.println();

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i =0; i< m.length;i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > maior){
                    maior = m[5][0];
                }
            }
        }

        System.out.println(maior);
    }
}
