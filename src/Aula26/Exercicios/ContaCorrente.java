package Aula26.Exercicios;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean realizarSaque(double quantiaSaque){
        if(saldo >= quantiaSaque){
            saldo -= quantiaSaque;
            return true;
        } else{
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaSaque){
                    saldo -= quantiaSaque;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Saldo limite especial: " + limiteEspecial);
    }
    boolean verificarChequeEspecial(){
        return saldo <= 0;
    }

}

