package Aula15Exec;

import java.util.Scanner;

public class Exec20 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        if(media >= 7){
            System.out.println("Aprovado");
        } else if(media < 7){
            System.out.println("Reprovado");
        }else if(media == 10){
            System.out.println("aprovado com distincao");
        }

    }
}
