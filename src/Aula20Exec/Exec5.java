package Aula20Exec;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[][][] compromissos = new String[31][24][12];

        int opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("Digite 1 pra adicionar compromisso: ");
            System.out.println("Digite 2 para verificar compromisso: ");
            System.out.println("Digite 0 para sair.");

            opcao = sc.nextInt();

            if (opcao == 1) {
                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {
                    System.out.println("Digite o dia do mês: ");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Digite novamente, dia invalido");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Digite a hora: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Digite novamente, dia invalido");
                    }
                }

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Digite novamente, mês invalido");
                    }
                }
                for (int i = 0; i < compromissos.length; i++) {

                    for (int j = 0; j < compromissos[i].length; j++) {

                    }
                }
                sc.nextLine();
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora][mes] = sc.nextLine();

            } else if (opcao == 2) {
                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {
                    System.out.println("Digite o dia do mês: ");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Digite novamente, dia invalido");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Digite a hora: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Digite novamente, dia invalido");
                    }
                }
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Digite novamente, mÊs invalido");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora][mes]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("opcao errada. tente novamente");
            }

        }

    }
}