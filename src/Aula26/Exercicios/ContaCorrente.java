package Aula26.Exercicios;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean especial;
    double limite;

    void saque(double quantiaASacar){
        if(saldo >= quantiaASacar ){
            saldo -= quantiaASacar;
            return true;
        } else{
            if(especial){

            } else{
                return false;
            }
        }
    }
}
