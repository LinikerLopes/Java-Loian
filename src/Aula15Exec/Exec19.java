package Aula15Exec;

import java.util.Scanner;

public class Exec19 {
    public static void main(String[] args) {
String message = "Encerrando programa por numero digitado invalido";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 1 a 1000");
        int num1 = sc.nextInt();

            if(num1 <= 1000) {
                int centenas = num1 / 100;
                int dezenas = (num1 % 100) / 10;
                int unidades = num1 % 10;

                System.out.println("Centenas: " + centenas);
                System.out.println("Dezenas: " + dezenas);
                System.out.println("Unidades: " + unidades);
        }else {
            System.out.println(message);
        }

    }
}
