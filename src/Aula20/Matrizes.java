package Aula20;
import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double [][] notaAlunos  = new double[3][4];//declarando matriz
        notaAlunos [0][0] = 10.0;
        notaAlunos [0][1] = 5.0;
        notaAlunos [0][2] = 9.0;
        notaAlunos [0][3] = 10.0;

        notaAlunos [1][0] = 9;
        notaAlunos [1][1] = 11;
        notaAlunos [1][2] = 15;
        notaAlunos [1][3] = 14;

        notaAlunos [2][0] = 11;
        notaAlunos [2][1] = 19;
        notaAlunos [2][2] = 12;
        notaAlunos [2][3] = 13;

        for(int i = 0; i < notaAlunos.length; i++){
            for( int j = 0; j < notaAlunos[i].length; j++){
                System.out.print(notaAlunos[i][j] + "...");
            }
            System.out.println();
        }

        for (double[] notasAlunos : notaAlunos){
            for(double nota: notasAlunos){
                System.out.print(nota + " /_/ ");
            }
            System.out.println(" ");
        }
    }
}
