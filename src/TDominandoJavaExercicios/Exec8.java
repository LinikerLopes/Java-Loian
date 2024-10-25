package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println(delta);

        //formula de delta: b² - 4 * a * c
    }
}
