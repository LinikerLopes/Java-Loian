package Aula24Exerc.ContaCorrente;

public class Exec2 {

    String contacorrente;
    double saldoConta;
    boolean contaEspecial;
    double limite;


    double sacar(double saque) {
        System.out.println("Seu saldo é de : " +saldoConta);
        System.out.println("Valor que quer sacar: " + saque);
        if (saque > saldoConta) {
            System.out.println("Saque não autorizado");
        } else {
            double soma = 0;
            System.out.println("Saque liberado.");
            soma = saldoConta - saque;
        }
        return saldoConta;
    }

        void mensagem(){
            System.out.println("Bem vindo ao banco GNB (How I met your mother)");
            System.out.println("==============================================");
            System.out.println();
        }
        void menu(){
            System.out.println("Escolha as opcoes para atendimento:");
            System.out.println("1 - Conferir saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Cliente especial");
        }
        int opcao(int escolha){
            switch(escolha){
                case 1:
                    System.out.println("Conferir saldo");
                    System.out.println(saldoConta);
                    break;
                case 2:
                    System.out.println("Saque");
                    //fazer o saque
                    break;
                case 3:
                    System.out.println("Depositar");
                    //despositar
                    break;
                case 4:
                    System.out.println("Cliente especial");
                    //valor do cheque especial disponivel
                    break;
                default:
                    System.out.println("Nenhuma opcao escolhida");
            }
            return escolha;
        }

}
