package Aula17Exec;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = (num1+1); i < num2; i++ ){
            System.out.println(i);
        }

    }
}
