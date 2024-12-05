package Aula19Exec;

import java.util.Arrays;

public class Exec1_1 {
    public static void main (String[] args){
        int[] a = new int[4];
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for( int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
