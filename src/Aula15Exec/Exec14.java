package Aula15Exec;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite segunda nota: ");
        double nota2 = sc.nextDouble();

        double nota = (nota1 + nota2) / 2;

        if(nota <= 4){
            System.out.println("E");
        }else if(nota > 4 && nota < 6){
            System.out.println("D");
        }else if(nota > 6 && nota < 7.5){
            System.out.println("C");
        }else if(nota > 7.5 && nota < 9){
            System.out.println("B");
        }else if(nota > 9 && nota < 10){
            System.out.println("A");
        }else {
            System.out.println("Oh Oh! alguem digitou errado");
            }

        if(nota <= 6){
            System.out.println("Reprovado");
        }else if(nota > 6 && nota <= 10) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Error");
        }

        }
}
