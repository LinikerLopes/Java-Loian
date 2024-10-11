package Aula15Exec;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número: "+num1 + ":  é maior que o segundo numero: " + num2);
        } else if(num1 < num2){
            System.out.println("O segundo número: "+num2 + ":  é maior que o primeiro numero: " + num1);
        }else{
            System.out.println("O primeiro número: "+num1 + ":  é igual ao segundo numero: " + num2);
        }
    }
}
