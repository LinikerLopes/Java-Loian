package Aula15Exec;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que turno você estuda? ");
        System.out.println("1 - Matutino");
        System.out.println("2 - Vespertino");
        System.out.println("3 - Noturno");
        int turno = sc.nextInt();


        switch(turno){
            case 1:
                System.out.println("Bom dia!");
                break;
            case 2:
                System.out.println("Boa tarde!");
                break;
            case 3:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor Inválido");
        }
    }
}
