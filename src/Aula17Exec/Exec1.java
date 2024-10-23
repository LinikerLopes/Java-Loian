package Aula17Exec;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //do-while e for
int num;
        do {
            System.out.println("Informe um numero entre 0 e 10");
            num = sc.nextInt();

                if(num >= 0 && num <= 10){
                    System.out.println("Voce digitou: " + num);
                }else{
                    System.out.println("Numero invalido, digite novamente");
                }
        } while (num < 0 || num > 10);
        System.out.println("Programa finalizado");
    }
}
