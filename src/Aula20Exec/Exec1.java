package Aula20Exec;

import java.util.Random;

public class Exec1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] m = new int[4][4];

        for(int i = 0; i < m.length; i++){
            for ( int j = 0; j < m[i].length; j++){
                m[i][j] = random.nextInt(10);

                System.out.print(m[i][j] + " - ");
            }
        }
        int maior = 0;
        int linha = 0;
        int coluna = 0;

            for(int i = 0; i< m.length;i++){
                for (int j = 0; j < m[i].length; j++){
                    if(m[i][j] > maior){
                        maior = m[i][j];
                        linha = i;
                        coluna = j;
                    }
                }
            }
        System.out.println();
        System.out.println(maior);
        System.out.println(linha);
        System.out.println(coluna);


    }
}
