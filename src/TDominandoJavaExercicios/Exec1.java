package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:  ");
        int num2 = sc.nextInt();

      int soma = num1 + num2;
      int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(num1 + " + "+ num2 + " = " + soma);
        System.out.println(num1 + " - "+ num2 + " = " + sub);
        System.out.println(num1 + " * "+ num2 + " = " + mult);
        System.out.println(num1 + " / "+ num2 + " = " + div);
    }



}
