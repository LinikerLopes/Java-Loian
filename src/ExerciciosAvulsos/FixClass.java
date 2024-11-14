package ExerciciosAvulsos;

public class FixClass {

    private String conta;
    private String nome;
    private double deposito;
    private double saldo = 0;
    private double saque;
    private double taxa = 5;
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        saldo += deposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
        saldo -= saque + taxa;
    }

    public void informacao(){
            System.out.print("Account " + conta + ", Holder: " + nome + ", Balance: $" + saldo );
        }


}
