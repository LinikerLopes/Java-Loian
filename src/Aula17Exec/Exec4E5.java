package Aula17Exec;

import java.util.Scanner;

public class Exec4E5 {
    public static void main(String[] args) {

        /*double populacaoA = 80000;
        double taxaCrescimentoA = 3.0;
        double populacaoB = 200000;
        double taxaCrescimentoB = 1.5;

        double crescimentoA = (taxaCrescimentoA/100) * populacaoA;
        System.out.println(crescimentoA);
        double crescimentoB = (taxaCrescimentoB/100) * populacaoB;
        System.out.println(crescimentoB);

        double somaCrescimentoA = populacaoA + crescimentoA;
        double somaCrescimentoB = populacaoB + crescimentoB;

       do{

      }while(somaCrescimentoA != somaCrescimentoB);*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite populacao A: ");
        double popA = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite populacao B: ");
        double popB = sc.nextDouble();
        System.out.println("Digite taxa crescimento de A: ");
        double taxaA = sc.nextDouble();
        System.out.println("Digite taxa crescimento de B: ");
        double taxaB = sc.nextDouble();
        int cont = 0;

        while(popA != popB){
            popA += (taxaA/100) * popA;
            popB += (taxaB/100) * popB;
            cont++;
            System.out.printf("%.2f",popA);
            System.out.println(" pessoas.");
            System.out.printf("%.2f",popB);
            System.out.println(" pessoas.");
            System.out.println("Anos ate ficarem iguais: " + cont);

        }

    }
}
