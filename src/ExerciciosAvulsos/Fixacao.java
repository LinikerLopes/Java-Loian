package ExerciciosAvulsos;

import java.util.Objects;
import java.util.Scanner;

public class Fixacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FixClass dados = new FixClass();

        System.out.print("Enter an account number: ");
       String conta = sc.nextLine();
        dados.setConta(conta);

        System.out.print("Enter an account holder name: ");
        String nome = sc.nextLine();
        dados.setNome(nome);

        System.out.println("Is there an initial deposit (y/n)");
        String resposta = sc.nextLine();

        double deposito;

            if(Objects.equals(resposta, "y")){
                System.out.println("Enter inicial deposit value:");
                    deposito = sc.nextDouble();
                    dados.setSaldo(deposito);
            }
            else{
                System.out.println("Nothing interest happens here");
            }
            dados.informacao();
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositei = sc.nextDouble();
        dados.setDeposito(depositei);

        dados.informacao();
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        System.out.println("Updated account data: ");
        dados.setSaque(saque);
        dados.informacao();
    }
}
