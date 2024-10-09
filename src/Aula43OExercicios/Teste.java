package Aula43OExercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Goliath National Bank");

        System.out.println("==================================");

        while (true) {
            System.out.println("1 - Acessar conta");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Mostrar saldo (baseado em rendimento");
            System.out.println("6 - Mostrar dados bancarios");
            System.out.println("7 - Sair");
            System.out.println();
            System.out.print("Digite a sua opção: ");
            int opcao = sc.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    //acessarConta();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 2:
                    // cadastrarConta();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 3:
                    //depositarConta();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 4:
                    //sacarDaConta();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 5:
                    //mostrarSaldoRendimento();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 6:
                    //mostrarDados();
                    System.out.println("Fora do ar!");
                    System.out.println("===========");
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
