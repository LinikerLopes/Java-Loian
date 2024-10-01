package Aula26.Exercicios;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();
        conta.numero = 1234567;
        conta.saldo = 1500;
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo = " + conta.saldo + " Limite Chegue Especial : " + conta.limiteEspecial);
        System.out.println("Deseja efetuar saque? 0 - SIM; 1 - NAO");
        int respostaSaque = sc.nextInt();

        if(respostaSaque == 0) {
            System.out.println("Quanto deseja retirar? ");
            double saque = sc.nextDouble();
            boolean saqueEfetuado = conta.realizarSaque(saque);

            if(saqueEfetuado) {
                System.out.println("Saldo da conta: " + conta.saldo + " Cheque especial: " + conta.limiteEspecial);
                System.out.println("Saque efetuado com sucesso");
                conta.consultarSaldo();
            } else {
                System.out.println("Nao foi possivel realizar saque.. Insuficiente");
                conta.consultarSaldo();
            }

            if(conta.verificarChequeEspecial()){
                System.out.println("Esta usando cheque especial");
            }else{
                System.out.println("Não esta usando cheque especial");
            }

        }



        System.out.println("Desejar depositar? 0 - SIM; 1 - NÃO");
        int respostaDeposito = sc.nextInt();

        if(respostaDeposito == 0){

            System.out.println("Quanto deseja depositar?");
            double deposito = sc.nextDouble();
            conta.saldo += deposito;
            System.out.print("Seu saldo agora é de ");
            conta.consultarSaldo();
        } else{
            System.out.println("Continua processo");
        }




    }
}
