package Aula13Exec;

import java.util.Scanner;

public class Exec12e13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Você é 1 - homem ou 2 - mulher? ");
        int opcao = sc.nextInt();
        sc.nextLine();

        double pesoIdealM = 0;
        double pesoIdealF = 0;
        switch (opcao) {
            case 1:
                pesoIdealM = (72.2 * altura) - 58;
                System.out.printf("%.2f ", pesoIdealM);
                System.out.println(" kg é seu peso ideal");
                System.out.println();
                System.out.println("Digite seu peso: ");
                double pesoAtualM = sc.nextDouble();

                if (pesoAtualM == pesoIdealM) {
                    System.out.println("Seu peso é o ideal;");
                } else if (pesoAtualM < pesoIdealM) {
                    System.out.println("Peso abaixo do ideal");

                }else{
                    System.out.println("Peso acima do ideal");
                }
                break;
            case 2:
                pesoIdealF = (62.1 * altura) - 44.7;
                System.out.printf("%.2f ", pesoIdealF);
                System.out.println(" kg é seu peso ideal");
                System.out.println();
                System.out.println("Digite seu peso: ");
                double pesoAtualF = sc.nextDouble();

                if (pesoAtualF == pesoIdealF) {
                    System.out.println("Seu peso é o ideal;");
                } else if (pesoAtualF < pesoIdealF) {
                    System.out.println("Peso abaixo do ideal");

                }else{
                    System.out.println("Peso acima do ideal");
                }
                break;

            default:
                System.out.println("opcao invalida");
        }

    }
}
