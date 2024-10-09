package Aula43OExercicios;

public class ContaBancaria {
    public String nomeCliente;
    public String numConta;
    public double saldo;

    public int saldoNegativo(){
        return 0;
    }

    public void deposito(){
        saldo += saldo;
    }

}

