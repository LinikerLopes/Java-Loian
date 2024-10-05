package Aula34Static.Exercicios;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Entre com um numero positivo: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("numero invalido");
            }
        } while (num < 0);
        System.out.println(Calculadora.fatorialNR(num));
        System.out.println(Calculadora.fatorialR(num));
    }
}
