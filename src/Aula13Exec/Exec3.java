package Aula13Exec;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println();
        int result = num1 + num2;
        System.out.println("A soma dos numeros é igual a: " + result);

    }
}
