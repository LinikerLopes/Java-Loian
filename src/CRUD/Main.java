package CRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            boolean opcao = false;
        while(!opcao) {
            System.out.println();
            System.out.println("====== MENU ======");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Consultar dados do produto");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opcao: " );
            int diaSemana = sc.nextInt();

            if (diaSemana == 1) {
                System.out.println("Domingo");
                opcao = true;
            } else if (diaSemana == 2) {
                System.out.println("Segunda");
                opcao = true;
            } else if (diaSemana == 3) {
                System.out.println("Terça");
                opcao = true;
            } else if (diaSemana == 4) {
                System.out.println("Quarta");
                opcao = true;
            } else if (diaSemana == 5) {
                System.out.println("Quinta");
                opcao = true;
            } else if (diaSemana == 6) {
                System.out.println("Sexta");
                opcao = true;
            } else if (diaSemana == 7) {
                System.out.println("Sabado");
                opcao = true;
            } else {
                System.out.println("Numero invalido");
            }
        }
    }
}
