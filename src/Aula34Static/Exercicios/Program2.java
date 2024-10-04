package Aula34Static.Exercicios;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero; ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        Calculadora.somar();*/

        imprimirTela(Calculadora.somar(1,2));
        imprimirTela(Calculadora.dividir(10,2));
        imprimirTela(Calculadora.multiplicar(5,5));
        imprimirTela(Calculadora.subtrair(6,3));
        imprimirTela(Calculadora.potencia(2,9));

    }
    static void imprimirTela(int num){
        System.out.println(num);
    }
}
