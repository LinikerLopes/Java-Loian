package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:  ");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro numero:  ");
        double num3 = sc.nextDouble();

       double mediaGeometrica = Math.pow(num1 * num2 * num3, 1.0/3.0);

        System.out.println(mediaGeometrica);

        //formula:
        /* multiplique os valores de num1, num2e  num3
        Exxtraia a raiz cubica do resultado da multiplicacao:
        ex.: 2 4 e 8 = 64.. raiz cubica de 64 = 4
         */




        //testee =======


       // int cont = 1;

        //double soma = num1 * num2 * num3;
        //for(int i = 1; i < num2; i++){ <-  tambem funciona


       // System.out.println(soma);




    }
}