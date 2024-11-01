package Aula20Exec.Exercicios;


import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String[][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        while (!sair){
            System.out.println("Digite 1");
            System.out.println("Digite 2");
            System.out.println("Digite 3");

            opcao = sc.nextByte();

            if(opcao == 1){
                System.out.println("Entre com o dia do mês");
                int dia = sc.nextInt();
            }else if(opcao == 2){

            }else if(opcao == 0){
                sair = true;
            } else{
                System.out.println("Opcao invalida, diigite novamente");
            }
        }
    }
}
