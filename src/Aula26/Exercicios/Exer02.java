package Aula26.Exercicios;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = 1234567;
        conta.saldo = -10;
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo = " + conta.saldo + " Limite : " + conta.limiteEspecial);

        boolean saqueEfetuado = conta.realizarSaque(520);

            if(saqueEfetuado) {
                System.out.println("Saldo da conta: " + conta.saldo);
                System.out.println("saque efetuado com sucesso");
            } else {
                System.out.println("Nao foi possivel realizar saque.. Insuficiente");
            }

    }
}
