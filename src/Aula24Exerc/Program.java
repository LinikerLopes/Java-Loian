package Aula24Exerc;

public class Program {
    public static void main(String[] args) {

        Dados dados = new Dados();

        dados.saldoConta = 1500.0;
        dados.inss = 150;

        dados.exibirSaldo();

double anotado = dados.exibirDescontoInss();
        System.out.println(anotado);




    }
}
