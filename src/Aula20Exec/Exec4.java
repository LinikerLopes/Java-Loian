package Aula20Exec;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    String [][] compromissos = new String[31][24];

    int opcao;
    boolean sair = false;

    while(!sair){
        System.out.println("Digite 1 pra adicionar compromisso: ");
        System.out.println("Digite 2 para verificar compromisso: ");
        System.out.println("Digite 0 para sair.");

        opcao = sc.nextInt();

        if(opcao == 1){
boolean diaValido = false;
int dia;

while(!diaValido) {
    System.out.println("Digite o dia do mês: ");
    dia = sc.nextInt();
    if (dia > 0 && dia <= 31) {
        diaValido = true;
    }else{
        System.out.println("Digite novamente, dia invalido");
    }
}
boolean horaValida =  false;
int hora;
            while(!horaValida) {
                System.out.println("Digite a hora: ");
                hora = sc.nextInt();
                if (hora > 0 && hora <= 24) {
                    horaValida = true;
                }else{
                    System.out.println("Digite novamente, dia invalido");
                }
            }
            for (int i = 0; i < compromissos.length; i++){

                for (int j = 0; j < compromissos[i]. length;j++){

                }
            }
        } else if(opcao == 2){
                for (int i = 0; i < compromissos.length; i++){
                    for (int j = 0; j < compromissos[i]. length;j++){
                        System.out.print(compromissos[i][j] + " _ ");
                    }
                    System.out.println();
                }
        }else if (opcao == 0) {
            sair = true;
        }else{
            System.out.println("opcao errada. tente novamente");
        }

    }

}
}