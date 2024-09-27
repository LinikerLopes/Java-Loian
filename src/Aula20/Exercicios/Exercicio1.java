package Aula20.Exercicios;

import java.util.Random;

//Gere e imprima uma Matriz M 4x4 com valores aleatório de 0 a 9. Apos isso, determine o numero maior e sua posicao (linha e coluna)

public class Exercicio1 {
    public static void main(String[] args) {

        int[][] M = new int[4][4];

        Random numeroRandom = new Random(); //classe gera numeros random

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                //tentei um Math.random, mas ainda nao sei declarar
                M[i][j] = numeroRandom.nextInt(10);

            }
        }
        int maior = 0;
        int linha = 0;
        int col = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] > maior) {
                    maior = M[i][j];
                        linha = i;
                            col = j;

                }
            }
        }
        System.out.println("Maior valor =" + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }
}