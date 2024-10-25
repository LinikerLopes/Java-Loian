package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raioCirculo = sc.nextDouble();
        final double pi = 3.141516;

        double area = pi * (raioCirculo * raioCirculo);
        System.out.printf("Area do circulo é igual a %.2f\n", area);

    }
}
