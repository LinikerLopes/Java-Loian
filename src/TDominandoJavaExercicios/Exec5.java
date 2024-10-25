package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é igual a: %.2f\n",IMC );
    }
}
