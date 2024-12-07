package Aula20Exec;

import java.util.Scanner;

public class Exec5Revisao {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        final int meS = 12;
        final int diaS = 31;
        final int horaS = 24;

        String[][][] compromissos = new String[meS][diaS][horaS];
boolean opcao = false;

        while(!opcao){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir compromisso");
            System.out.println("2 - Ver compromisso");
            System.out.println("3 - Deletar compromisso");
            System.out.println("4 - Atualizar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opcao: ");
            int escolha = sc.nextInt();
//======================================================================================================================
            if (escolha == 1) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes <= meS){
                        mesValido = true;
                    }else {
                        System.out.println("Mês digitado é invalido.Tente novamente");
                    }
                }
                sc.nextLine();
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite o dia: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= diaS){
                        diaValido = true;
                    }else{
                        System.out.println("Dia digitado é invalido. Tente novamente");
                    }
                }
                sc.nextLine();
                boolean horaValida = false;
                int hora = 0;
                 while(!horaValida){
                     System.out.println("Digite a hora:");
                     hora = sc.nextInt();
                     if(hora > 0 && hora <= horaS){
                         horaValida= true;
                     }else{
                         System.out.println("Hora digitada é invalida. Tente novamente");
                     }
                 }
                sc.nextLine();
                 dia--;
                System.out.println("Digite seu compromisso:");
                compromissos[mes][dia][hora] = sc.nextLine();

            }
//======================================================================================================================
            else if(escolha == 2){
                    boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes <= meS){
                        mesValido = true;
                    }else {
                        System.out.println("Mês digitado é invalido.Tente novamente");
                    }
                }
                sc.nextLine();
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite o dia: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= diaS){
                        diaValido = true;
                    }else{
                        System.out.println("Dia digitado é invalido. Tente novamente");
                    }
                }
                sc.nextLine();
                boolean horaValida = false;
                int hora = 0;
                while(!horaValida){
                    System.out.println("Digite a hora:");
                    hora = sc.nextInt();
                    if(hora > 0 && hora <= horaS){
                        horaValida= true;
                    }else{
                        System.out.println("Hora digitada é invalida. Tente novamente");
                    }
                }
                sc.nextLine();
                dia--;
                if(compromissos[mes][dia][hora] != null && compromissos[mes][dia][hora].length() > 0) {
                    System.out.println("Você tem um compromisso nessa data:");
                    System.out.println("====================================================================================");
                    System.out.println(compromissos[mes][dia][hora]);
                    System.out.println("====================================================================================");
                }else{
                    System.out.println("Você não tem um compromisso nessa data. Volte ao menu e inclua um.");
                }
            }
            else if(escolha == 3) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes <= meS){
                        mesValido = true;
                    }else {
                        System.out.println("Mês digitado é invalido.Tente novamente");
                    }
                }
                sc.nextLine();
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite o dia: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= diaS){
                        diaValido = true;
                    }else{
                        System.out.println("Dia digitado é invalido. Tente novamente");
                    }
                }
                sc.nextLine();
                boolean horaValida = false;
                int hora = 0;
                while(!horaValida){
                    System.out.println("Digite a hora:");
                    hora = sc.nextInt();
                    if(hora > 0 && hora <= horaS){
                        horaValida= true;
                    }else{
                        System.out.println("Hora digitada é invalida. Tente novamente");
                    }
                }
                sc.nextLine();
                dia--;
                if(compromissos[mes][dia][hora] != null && compromissos[mes][dia][hora].length() > 0) {
                    System.out.println("Você tem um compromisso nessa data:");
                    System.out.println("====================================================================================");
                    System.out.println(compromissos[mes][dia][hora]);
                    System.out.println("====================================================================================");
                    System.out.println("Deseja apagar?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NAO");
                    int resposta = sc.nextInt();
                    if(resposta == 1){
                        compromissos[mes][dia][hora] = null;
                    }
                    else if(resposta == 2){
                        System.out.println("Nenhuma alteração feita. Retornando ao menu");
                    }
                    else{
                        System.out.println("Nenhuma opcao valida foi indicada.");
                    }
                }else{
                    System.out.println("Você não tem um compromisso nessa data. Volte ao menu e inclua um.");
                }

            }

            else if(escolha == 4) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Digite o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes <= meS){
                        mesValido = true;
                    }else {
                        System.out.println("Mês digitado é invalido.Tente novamente");
                    }
                }
                sc.nextLine();
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite o dia: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= diaS){
                        diaValido = true;
                    }else{
                        System.out.println("Dia digitado é invalido. Tente novamente");
                    }
                }
                sc.nextLine();
                boolean horaValida = false;
                int hora = 0;
                while(!horaValida){
                    System.out.println("Digite a hora:");
                    hora = sc.nextInt();
                    if(hora > 0 && hora <= horaS){
                        horaValida= true;
                    }else{
                        System.out.println("Hora digitada é invalida. Tente novamente");
                    }
                }
                sc.nextLine();
                dia--;
                System.out.println("Você tem um compromisso nessa data:");
                System.out.println("Deseja atualizar?");
                System.out.println("1 - SIM");
                System.out.println("2 - NAO");
                int resposta = sc.nextInt();
                sc.nextLine();
                if(resposta == 1){
                    System.out.println("Digite o novo compromisso: ");
                    compromissos[mes][dia][hora] = sc.nextLine();
                }
                else if(resposta == 2){
                    System.out.println("Nenhuma alteração feita. Retornando ao menu");
                }
                else{
                    System.out.println("Nenhuma opcao valida foi indicada.");
                }
            }
            else if(escolha == 0){
                System.out.println("Saindo do programa.");
                opcao = true;
            }else{
                System.out.println("Opcao invalida. Tente novamente");
            }

        }
    }
}
