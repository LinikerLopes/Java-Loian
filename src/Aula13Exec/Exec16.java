package Aula13Exec;

import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("1L para 3m²");
        System.out.println("Area total a ser pintada: ");
        double areaTotal = sc.nextDouble();

        double lataTinta = 18.0;
        double areaLata = lataTinta * 3.0;
        double precoLata = 80.0;

        double latasUsadas = areaTotal / areaLata;
        double precoLatasUsadas = latasUsadas * precoLata;

        System.out.printf("Qtd latas que usará: %.1f", latasUsadas);
        System.out.println(" latas de 18 litros.");
        System.out.printf("Você gastará R$ %.2f\n",precoLatasUsadas);

        //==================================== EXE 17
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("1L para 6m²");

        double galaoTinta = 3.6;

        double areaGalao = galaoTinta * 6.0;
        areaLata = lataTinta * 6.0;

        double precoGalao = 25.0;

        latasUsadas = areaTotal / areaLata;
        precoLatasUsadas = latasUsadas * precoLata;

        System.out.printf("Qtd latas que usará: %.1f", latasUsadas);
        System.out.println(" latas de 18 litros.");
        System.out.printf("Você gastará R$ %.2f\n",precoLatasUsadas);




    }
}
