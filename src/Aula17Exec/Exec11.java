package Aula17Exec;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int soma = 0;
            for (int i = num1; i <=num2; i++ ){
                soma += i;

            }
        System.out.println(soma);

    }
}
