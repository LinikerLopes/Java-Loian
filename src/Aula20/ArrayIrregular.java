package Aula20;

import java.util.Scanner;

public class ArrayIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pessoas entrevistadas: ");
        int filho = sc.nextInt();

        String[][] nomeFilhos = new String[filho][];

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Quantos filhos voce tem: ");
            int qtdFilhos = sc.nextInt();
            nomeFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Qual nome do filho numero " + (j + 1) + " .");

                nomeFilhos[i][j] = sc.next();
            }
        }
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Pessoa " + (i+1) + " tem " + nomeFilhos[i].length + " filhos. Seus nomes são: ");

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);

            }
        }
    }
}