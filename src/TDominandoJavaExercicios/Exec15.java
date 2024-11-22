package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("Volume é de : %.2f", volume);

    }

}
