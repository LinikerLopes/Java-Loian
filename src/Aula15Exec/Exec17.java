package Aula15Exec;

import java.util.Scanner;

public class Exec17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("Ano bissexto");

        }else{
            System.out.println("Ano nao é bissexto");
        }
    }
}
