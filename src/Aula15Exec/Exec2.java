package Aula15Exec;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println(num + " é um numero positivo");
        }else{
            System.out.println(num + " é um numero negativo");
        }
    }
}
