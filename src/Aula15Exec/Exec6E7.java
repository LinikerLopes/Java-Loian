package Aula15Exec;

import java.util.Scanner;

public class Exec6E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro número: "+num1 + ":  é maior ");
        } else if(num2 > num3){
            System.out.println("O segundo número: "+num2 + ":  é maior ");
        }else{
            System.out.println("O terceiro número: "+num3 + ":  é o maior");
        }

        if(num1 < num2 && num1 < num3){
            System.out.println("O primeiro número: "+num1 + ":  é o menor ");
        } else if(num2 < num3){
            System.out.println("O segundo número: "+num2 + ":  é menor ");
        }else{
            System.out.println("O terceiro número: "+num3 + ":  é o menor");
        }
        }

    }

