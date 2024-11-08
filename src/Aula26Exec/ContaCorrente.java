package Aula26Exec;

public class ContaCorrente {

    String numeroConta = "212121212121";
    double saldo;
    boolean especial = true;
    double limiteEspecial = 500;
        double saque;
        double deposito;

    void realizarSaque(){
        if(saldo > 0 && saldo >= saque){
            saldo -= saque;
            System.out.println("==============================");
            System.out.println("Saque realizado");
            System.out.println("Saldo atual: "+saldo);
            System.out.println("==============================");
        }else{
            System.out.println("==============================");
            System.out.println("Saldo indisponivel");
            System.out.println("Saldo: " + saldo);
            System.out.println("==============================");

        }
    }

    void depositar(){
        saldo += deposito;
        System.out.println("==============================");
        System.out.println("Deposito de " + deposito + " feito.");
        System.out.println("Saldo atual: " + saldo);
        System.out.println("==============================");
    }
    void saldoAtual(){
        System.out.println("==============================");
        System.out.println("Seu saldo é de: "+ saldo);
        System.out.println("==============================");

    }
    void verificarEspecial(){
        if(especial){
            System.out.println("==============================");
            System.out.println("Cliente tem saldo no limite especial");
            System.out.println("Valor: " + limiteEspecial);
            System.out.println("==============================");
        }
    }
}
