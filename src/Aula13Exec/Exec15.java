package Aula13Exec;


import java.util.Scanner;

public class Exec15 {
    public static void main(String[] args) {


        double inss = 8;
        double iR = 11;
        double sindicato = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.println();

        double desconto1 = salarioBruto - (salarioBruto * (1-(iR/100)) );
        double desconto2 = salarioBruto - (salarioBruto * (1 - (inss/100)));
        double desconto3 = salarioBruto - (salarioBruto * (1- (sindicato/100)));
        double descontos = desconto1 + desconto2 + desconto3;

        double salarioLiquido = salarioBruto - descontos;

        System.out.println("IR vai levar: " + desconto1);
        System.out.println("INSS vai levar: "+desconto2);
        System.out.println("SINDICATO vai levar: " + desconto3);
        System.out.println("Total de todos os descontos: " + descontos);
        System.out.println("Salario Liquido apos os descontos é de: " + salarioLiquido);
    }

}
