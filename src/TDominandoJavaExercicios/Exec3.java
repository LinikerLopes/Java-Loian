package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:  ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:  ");
        int num3 = sc.nextInt();

        int soma = num1 + num2 + num3;

        int mediaAritmetica = (num1 + num2 + num3) / 3;
        System.out.println("A media da soma dos numeros: " + num1 + " + " + num2 + " + " + num3 + " que é igual a " + soma + " é igual a : " + mediaAritmetica);
    }
}