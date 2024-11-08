package Aula26Exec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampada lampada = new Lampada();

            if(lampada.estado){
                System.out.println("Lampada esta ligada");
            }else{
                System.out.println("Lampada esta desligada");
            }
                int opcao;
                boolean interruptor = true;
            while(interruptor){
                System.out.println("Você quer desligar?");
                System.out.println("1 - SIM");
                System.out.println("2 - NAO");
                opcao = sc.nextInt();
                if(opcao == 1) {
                    lampada.desligar();
                    lampada.mudarEstado();
                    interruptor = false;
                }else{
                    lampada.mudarEstado();
                }

            }



    }
}
