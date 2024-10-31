package Aula24Exerc.ContaCorrente;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exec2 banco = new Exec2();
        banco.saldoConta = 1500.0;
        banco.mensagem();
        banco.menu();
        int escolha = sc.nextInt();

        banco.opcao(escolha);


       /* banco.saldoConta = 30;
        banco.sacar(20);

        System.out.println(banco.saldoConta);*/

    }
}
