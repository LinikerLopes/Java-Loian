package Aula15Exec;

import java.util.Scanner;

public class Exec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite preco primeiro produto: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite preco segundo produto: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite preco terceiro produto: ");
        double num3 = sc.nextDouble();

        if (num1 < num2 && num1 < num3){
            System.out.println("Compre o primeiro produto: valor R$ "+ num1);
        } else if(num2 < num3){
            System.out.println("Compre o segundo produto: valor R$ "+ num2);
        }else{
            System.out.println("Compre o terceiro produto: valor R$ "+ num3);
        }

    }
}