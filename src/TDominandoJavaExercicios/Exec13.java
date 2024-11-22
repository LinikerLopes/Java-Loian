package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a força: ");
        double f = sc.nextDouble();

        System.out.println("Digite a distancia: ");
        double d = sc.nextDouble();

        double T = f * d;

        System.out.println("Trabalho = " + T);

    }
}
