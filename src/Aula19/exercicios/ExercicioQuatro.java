package Aula19.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioQuatro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite números de elementos na array:? ");
            int num = sc.nextInt();

        int[] A = new int[num];
        double[] B = new double[A.length];

        for(int i =0; i < A.length; i++) {
            System.out.println("Escreva o " + (i + 1) + " numero: ");
            A[i] = sc.nextInt();
        }
        for( int i = 0; i < A.length; i++){
            B[i] = Math.sqrt(A[i]);
            System.out.printf("B = %.2f%n", B[i]);
        }
    }
}
