package Aula13Exec;

import java.util.Scanner;

public class Exec9e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double temperaturaF = sc.nextDouble();

        double temperaturaCelsiuls = (5* (temperaturaF-32)/9);
        System.out.printf("%.2f ",temperaturaCelsiuls);
        System.out.println(" C° de temperatura");

        System.out.println("Digite a temperatura em Celsius: ");
        double celsiusTemp = sc.nextDouble();

        double fahreinhetTemp = (celsiusTemp * 1.8) + 32;

        System.out.printf("%.2f ",fahreinhetTemp);
        System.out.println(" F° de temperatura");
    }
}
