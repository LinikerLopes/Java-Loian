package Aula19.exercicios;

public class ExercicioDois {
    public static void main(String[] args){
        int[] A = new int[8];
        int[] B = A;
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;

        for (int i = 0; i < A.length; i++){
            System.out.println("A = " + A[i] + " . B = " + B[i] * 2);
        }

    }
}
