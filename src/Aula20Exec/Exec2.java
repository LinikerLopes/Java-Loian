package Aula20Exec;

import java.util.Random;

public class Exec2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] m = new int[10][10];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[5].length; j++) {
                if (m[5][j] > maior) {
                    maior = m[5][j];
                }
                if (m[5][j] < menor) {
                    menor = m[5][j];
                }
            }
        }

        System.out.println("Maior linha 5: " + maior);
        System.out.println("Menor linha 5: " + menor);

        int maior7 = Integer.MIN_VALUE;
        int menor7 = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][7] > maior7) {
                    maior7 = m[i][7];
                }
                if (m[i][7] < menor7) {
                    menor7 = m[i][7];
                }
            }
        }
        System.out.println();
        System.out.println("Maior col 7: " + maior7);
        System.out.println("menor col 7: " + menor7);
    }
}
