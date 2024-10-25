package Aula17Exec;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

   int par = 0;
   int impar = 0;

   for(int i = 0; i <10; i++){
       System.out.println("Digite um numero: ");
        int num = sc.nextInt();
       if(num % 2 == 0){
           par++;
       } else if(num % 2 != 0){
           impar++;
       }
    }
        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impar);


}

}
