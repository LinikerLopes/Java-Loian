package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 lados do triangulo");

       double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println();
        sc.nextLine();
        System.out.println("Digite altura: ");
        double h = sc.nextDouble();

        double P = a + b+ c;

        double Ai = (b*h) / 2;

        System.out.println("Perimetro: " + P);
        System.out.println("Area: " + Ai);
    }
}
