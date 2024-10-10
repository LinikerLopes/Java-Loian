package Aula13Exec;

import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        double dobrado = area * 2;

        System.out.println();
        System.out.println("==============");
        System.out.println("A area dobrada do quadrado é " + dobrado);
        System.out.println("Total de área:" + area);
    }
}
