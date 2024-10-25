package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec9 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();

        double perimetro = 2 *(largura+comprimento);
        double area = largura + comprimento;

        System.out.println("perimetro: "+perimetro);
        System.out.println("area: " + area);

    }
}
