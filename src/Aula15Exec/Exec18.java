package Aula15Exec;

import java.util.Scanner;

public class Exec18 {
    public static void main(String[] args){

        int n1;
        String garcom;
        double soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome do garçom: ");
        garcom = sc.nextLine();
        System.out.println("Digite quantidade de contas: ");
        n1 = sc.nextInt();

            for (int i = 0; i < n1; i++) {
                System.out.println("Digite valor da conta: " + (i + 1));
                double num1 = sc.nextDouble();
                soma += num1;
            }
        System.out.println("Garcom: "+ garcom);
        System.out.println("Total das contas: " + soma);
        }
    }