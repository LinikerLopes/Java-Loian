package Aula24Exerc;

public class Dados {

    String nome;
    String idade;
    String sexo;

    double saldoConta;
    double inss;

    void exibirSaldo(){
        System.out.println("Seu saldo é de : " + saldoConta);
    }

    double exibirDescontoInss(){
        System.out.println("TOTAL DO INVESTIMENTO: ");
        return saldoConta * inss;
    }

    double calcularRetorno(double retorno){
        double salario = retorno + inss;
        return salario;
    }

}
