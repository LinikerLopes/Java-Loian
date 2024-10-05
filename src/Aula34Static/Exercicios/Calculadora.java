package Aula34Static.Exercicios;

public class Calculadora {

    //public static int num1;
    // public static int num2;

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int potencia(int num1, int num2) {
        int total = num1;
        for (int i = 1; i < num2; i++) {
            total *= num1;

        }
        return total;
    }

    //5! = 5x4x3x2x1
    public static int fatorialNR(int num) {

        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i >= 1; i--) {
            total *= i;
            // int result = num*(i-1);
            // System.out.println("i = " + num + " * " + (i-1) + " = " + result);
        }
        return total;
    }

    public static int fatorialR(int num){
        if (num == 0){
            return 1;
        }

        return num * fatorialR(num-1);
    }
}
