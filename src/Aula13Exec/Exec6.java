package Aula13Exec;

import java.util.Locale;
import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double pi = 3.141516;

        System.out.println("Entre com o raio do círculo em cm(centrimetros): ");
        double raio = sc.nextDouble();
        double area = (raio * raio) * pi;

        System.out.println();
        System.out.println("=============================");
        System.out.printf("A área do circulo é igual a %.2f\n",area);


    }
}
