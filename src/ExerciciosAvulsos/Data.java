package ExerciciosAvulsos;


import java.time.LocalDate;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        TesteData teste = new TesteData();

        Scanner sc = new Scanner(System.in);
        System.out.println("Sigite um numero" );
        int num = sc.nextInt();
        System.out.println(teste.calculaFatorial(num));
        System.out.println(d1);

    }
}
