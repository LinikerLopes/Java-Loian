package Aula13Exec;

import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Area total a ser pintada: ");
        double areaTotal = sc.nextDouble();

        double lataTinta = 18.0;
        double coberturaTinta3 = 3.0;
        double areaLata = lataTinta * coberturaTinta3;
        double precoLata = 80.0;
        double coberturaTinta6 = 6.0;
        double latasUsadas = areaTotal / areaLata;
        double precoLatasUsadas = latasUsadas * precoLata;
        double FOLGA = 1.10;

        System.out.println("1L para 3m²");
        System.out.printf("Qtd latas que usará: %.1f", latasUsadas);
        System.out.println(" latas de 18 litros.");
        System.out.printf("Você gastará R$ %.2f\n",precoLatasUsadas);

        //==================================== EXE 17
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("1L para 6m²");

        double galaoTinta = 3.6;

        double areaGalao = galaoTinta * 6.0;
        areaLata = lataTinta * coberturaTinta6;

        double precoGalao = 25.0;

        latasUsadas = areaTotal / areaLata;
        precoLatasUsadas = latasUsadas * precoLata;
        double galoesUsadas = areaTotal / areaGalao;
        double precoGaloesUsadas = galoesUsadas * precoGalao;

        //situacao 1
        System.out.println("Latas: ");
        System.out.printf("Qtd latas que usará: %.1f", latasUsadas);
        System.out.println(" latas de 18 litros.");
        System.out.printf("Você gastará R$ %.2f\n",precoLatasUsadas);
        System.out.println();

        //situação 2
        System.out.println("Galões: ");
        System.out.printf("Qtd galões que usará: %.1f", galoesUsadas);
        System.out.println(" galões de 3.6 litros.");
        System.out.printf("Você gastará R$ %.2f\n",precoGaloesUsadas);
        System.out.println();
        //situação 3
        System.out.println("Latas e galões: ");
        double litrosNecessarios = (areaTotal/ coberturaTinta6) * FOLGA;
        double qtdMixLatas = litrosNecessarios / lataTinta;
        double restoLitros = litrosNecessarios % lataTinta;
        double qtdMixGaloes = restoLitros / galaoTinta;
        double precoMix = (qtdMixLatas * precoLata) + (qtdMixGaloes * precoGalao);

        System.out.printf("Quantidade de latas: %.2f",qtdMixLatas);
        System.out.println(" latas.");
        System.out.printf("Quantidades de galões: %.2f", qtdMixGaloes);
        System.out.println(" galões");
        System.out.printf("Preço total: R$ %.2f", precoMix);
        System.out.println(" .");
    }
}
