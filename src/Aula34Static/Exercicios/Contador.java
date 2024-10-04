package Aula34Static.Exercicios;

public class Contador {

   private static int num1;

   public static void incrementar(){
       num1++;
   }
   public static void decrementar(){
       num1--;
   }
   public static void zerar(){
       num1 = 0;
   }
   public static int obterValor(){
       return num1;
   }


}
