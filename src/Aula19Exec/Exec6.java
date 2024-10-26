package Aula19Exec;

public class Exec6 {
    public static void main(String[] args) {

        int[] A = new int[1];
        int[] B = new int[1];
        int[] C = new int[A.length];

        for(int i = 0; i < A.length; i++){
            A[0] = 10;
        }
        for(int i = 0; i< A.length; i++){
            B[0] = 11;
        }
        for(int i = 0; i < A.length; i++){
            C[0] = A[0] + B[0];
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[0]);
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[0]);
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(C[0]);
        }


    }
}
