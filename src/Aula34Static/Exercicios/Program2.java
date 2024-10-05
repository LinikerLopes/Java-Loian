package Aula34Static.Exercicios;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero; ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Soma: ");
        imprimirTela(Calculadora.somar(num1,num2));
        System.out.println();
        System.out.print("Divisão: ");
        imprimirTela(Calculadora.dividir(num1,num2));
        System.out.println();
        System.out.print("Multiplicação: ");
        imprimirTela(Calculadora.multiplicar(num1,num2));
        System.out.println();
        System.out.print("Subtração: ");
        imprimirTela(Calculadora.subtrair(num1,num2));
        System.out.println();
        System.out.print("Potenciação: ");
        imprimirTela(Calculadora.potencia(num1,num2));

        System.out.println("===============");

    }
    static void imprimirTela(int num){
        System.out.println(num);
    }
}
