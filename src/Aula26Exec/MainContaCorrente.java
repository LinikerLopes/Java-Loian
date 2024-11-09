package Aula26Exec;

import java.util.Scanner;

public class MainContaCorrente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 2500.00;
        System.out.println("Bem vindo ao banco GNB");
        System.out.println("Conta: " + conta.numeroConta);
        System.out.println("=============================");
        System.out.println();
        System.out.println("- Escolha uma opção de serviço -");
        boolean opcao = false;
        int escolha;

        while(!opcao){
            System.out.println("1 - Saque");
            System.out.println("2 - Deposito");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Cheque Especial");
            System.out.println("0 - Sair");
            escolha = sc.nextInt();

            if(escolha == 1){
                System.out.println("Digite valor do saque:");
                conta.saque = sc.nextDouble();
                conta.realizarSaque(conta.saque);
            }
            else if(escolha == 2){
                System.out.println("Quanto deseja depositar?");
                conta.deposito = sc.nextDouble();
                conta.depositar();
            }
            else if(escolha == 3){
                conta.saldoAtual();

            }
            else if(escolha == 4){
                conta.verificarEspecial();
            }
            else if(escolha == 0){
                System.out.println("Obrigado por usar nossos serviços");
                System.out.println("FIM");
                System.out.println("...");
                opcao = true;
            }
            else{
                System.out.println("Opcao invalida. Escolha novamente ou encerre a aplicação");
            }
        }


    }
}
