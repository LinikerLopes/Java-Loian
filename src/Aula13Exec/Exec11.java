package Aula13Exec;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite primeiro numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.println("Digite segundo numero inteiro: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.println("Digite o numero real: ");
        double num3 = sc.nextDouble();
        System.out.println();

        int dobroMetade = (num1 * 2) + (num2/2);
        double triploTerceiro = (num1 * 3) + num3;
        double cubo = Math.pow(num3, 3);

        System.out.println("Resultado do dobro do primeiro pela metade do segundo: " + dobroMetade);
        System.out.println("Triplo do primeiro mais o terceiro " + triploTerceiro);
        System.out.println("O cubo do terceiro "+cubo);
    }
}
