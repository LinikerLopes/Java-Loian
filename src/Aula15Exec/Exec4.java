package Aula15Exec;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = sc.next();

        switch(letra){
            case "A":
                System.out.println("É uma vogal!");
                break;
            case "E":
                System.out.println("É uma vogal!");
                break;
            case "I":
                System.out.println("É uma vogal!");
                break;
            case "O":
                System.out.println("É uma vogal!");
                break;
            case "U":
                System.out.println("É uma vogal!");
                break;
            default:
                System.out.println("É uma consoante!");
        }
    }
}
