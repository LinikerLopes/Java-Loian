package Aula15Exec;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite segundo numero: ");
        int num2 = sc.nextInt();
        int media = (num1+num2)/2;
        int notaCorte = 7;
        int notaDistincao = 10;
        if(media >= notaCorte && media < 10){
            System.out.println("Aprovado!");
            System.out.println(media);
        }else if(media == notaDistincao){
            System.out.println("Aprovado com Distinção");
            System.out.println(media);
        }else{
            System.out.println("Reprovado");
            System.out.println(media);
        }
    }
}
