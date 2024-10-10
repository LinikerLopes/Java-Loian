package Aula13Exec;

import java.util.Locale;
import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Quantos metros você quer converter? ");
        double num = sc.nextDouble();

        double result = num * 100;

        System.out.println(num + " metros são " + result + " centimetros.");
    }
}
