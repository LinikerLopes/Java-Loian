package Aula17Exec;

import java.util.Scanner;

public class Exec12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int cont = 1;
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        while(cont < 10){
            cont++;
            int soma = num * (cont);
            System.out.println(num + " x " + (cont) + " = " +soma);
        }
    }
}
