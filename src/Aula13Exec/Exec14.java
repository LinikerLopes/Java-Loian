package Aula13Exec;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {

        double pesoAutorizado = 50.0;
        double multa = 4.0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos kg de peixe você pegou?");
        double peixePescado = sc.nextDouble();

        double penalidade = (peixePescado - pesoAutorizado) * multa;

        if(peixePescado > pesoAutorizado){
            System.out.println("Você terá de pagar o excedente ");
            System.out.println("Permitido: " + pesoAutorizado + " kg");
            System.out.println("Peso excedente: " + (peixePescado - pesoAutorizado) + " kg");
            System.out.println("Valor da Multa: R$ " + penalidade);
        }else {
            System.out.println("Você nao tem de pagar nada");
            multa = 0.0;
            double excesso = 0.0;
            System.out.println("Multa: " + multa);
            System.out.println("Excedido: " + excesso);
        }

    }
}
