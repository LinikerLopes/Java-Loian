package Aula17Exec;

import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o expoente: ");
        int num2 = sc.nextInt();

        int cont = 1;

        int soma = num1;
        //for(int i = 1; i < num2; i++){ <-  tambem funciona
        while(cont < num2){
            cont++;
            soma *= num1;

        }
        System.out.println("Base: " + num1);
        System.out.println("Expoente: " + num2);
        System.out.println("Resultado: "+soma);

        
    }
}
