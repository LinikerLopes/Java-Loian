package Aula24Exerc;

import Aula24Exerc.ContaCorrente.Exec2;

public class Program {
    public static void main(String[] args) {

        Dados dados = new Dados();

        dados.saldoConta = 1500.0;
        dados.inss = 150;

        dados.exibirSaldo(); // vazio

        double anotado = dados.exibirDescontoInss();
        System.out.println(anotado); // com retorno

        double retornoRetornado = dados.calcularRetorno(10);
        System.out.println(retornoRetornado); //com parâmetro

        System.out.println();



    }
}