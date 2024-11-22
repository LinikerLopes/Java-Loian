package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a variacao de espaço: ");
        double s = sc.nextDouble();
        System.out.println("Digite a variacao de tempo: ");
        double t = sc.nextDouble();

        double velocidadeMedia = s / t;

        System.out.println("Velocidade media = " + velocidadeMedia);

    }
}
