package Aula15Exec;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite F ou M: ");
        String letra = sc.next();

    switch (letra) {
        case "F":
            System.out.println("F - Feminino");
            break;
        case "M":
            System.out.println("M - Masculino");
            break;

        default:
            System.out.println("Sexo INvalido");
}
    }
}
