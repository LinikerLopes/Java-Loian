package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raioCirculo = sc.nextDouble();
        final double pi = 3.141516;

        double perimetro = 2 * (pi * raioCirculo);

        System.out.println(perimetro);

        //formula:
        // P = 2 * pi *  r

    }
}
