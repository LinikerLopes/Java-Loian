package Aula15Exec;

import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {

        double inss = 10;
        double iR = 5;
        double fgts = 11;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas horas trabalhadas no mês: ");
        double horaMes = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHoraTrabalhada = sc.nextDouble();
        System.out.println();
        double salarioBruto = horaMes * valorHoraTrabalhada;

        double desconto1 = salarioBruto - (salarioBruto * (1-(iR/100)) );
        double desconto2 = salarioBruto - (salarioBruto * (1 - (inss/100)));
        double desconto3 = salarioBruto - (salarioBruto * (1- (fgts/100)));
        double descontos = desconto1 + desconto2;

        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário bruto: %.2f\n" , salarioBruto);
        System.out.printf("IR: %.2f\n" , desconto1);
        System.out.printf("INSS: %.2f\n",desconto2);
        System.out.printf("FGTS: %.2f\n", desconto3);
        System.out.printf("Total de todos os descontos: %.2f\n",descontos);
        System.out.printf("Salario Liquido apos os descontos é de: %.2f\n", salarioLiquido);

    }
}
