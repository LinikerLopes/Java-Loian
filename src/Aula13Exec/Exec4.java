package Aula13Exec;

import java.util.Locale;
import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int tamanho = 4;
        double[] notas = new double[tamanho];
        double soma = 0;

        System.out.println("Insira as 4 notas para calculo da média: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Valor da nota " + (i+1));
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / tamanho;
        System.out.printf("A media geral foi de: %.2f\n", media);
    }
}
