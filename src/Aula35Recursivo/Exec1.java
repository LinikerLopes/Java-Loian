package Aula35Recursivo;

public class Exec1 {
  public static int fibonacci(int num){

      if(num <2){
          return 1;
      }

      return fibonacci(num -1) + fibonacci(num -2);
  }

  public static int somatorio(int num){

      if (num == 1){
          return 1;
      }
      return num + somatorio(num -1);
//5+4+3+2+1 = 15
  }


}
