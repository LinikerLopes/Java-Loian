package Aula26Exec;

public class ContaCorrente {

    String numeroConta = "212121212121";
    double saldo;
    boolean especial = true;
    double limiteEspecial = 500;
double saque;
        double deposito;

    boolean realizarSaque(double saque){
        if(saldo >= saque){
            saldo -= saque;
            System.out.println("==============================");
            System.out.println("Saque realizado");
            System.out.println("Saldo atual: "+saldo);
            System.out.println("==============================");
            return true;
        } else {
            if (especial) {
                double totalDisponivel = saldo + limiteEspecial;
                if (totalDisponivel >= saque) {
                    double saldoRestante = saque - saldo;
                    saldo = 0;
                    limiteEspecial -= saldoRestante;

                    System.out.println("==============================");
                    System.out.println("Saque realizado com uso do limite especial");
                    System.out.println("Saldo atual: "+saldo);
                    System.out.println("Limite especial restante: "+limiteEspecial);
                    System.out.println("==============================");
                    return true;
                }
            }

            System.out.println("==============================");
            System.out.println("Saldo indisponível");
            System.out.println("Saldo: " + saldo);
            System.out.println("Limite especial restante: "+limiteEspecial);
            System.out.println("==============================");
        }
        return false;
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
