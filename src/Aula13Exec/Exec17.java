package Aula13Exec;

import java.util.Scanner;

public class Exec17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do arquivo para download: ");
        double tamanhoArquivo = sc.nextDouble();
        System.out.println();
        System.out.println("Velocidade link de internet (MBPS)");
        double velocidadeLinkDownload = sc.nextDouble();

        double tempo = (tamanhoArquivo * 8) / velocidadeLinkDownload;

        double total = tempo / 60;

        System.out.printf("Tempo em segundos: %.2f\n",tempo);
        System.out.printf("Tempo (em minutos) de download é de: %.2f", total);
        System.out.println(" minutos.");

    }
}
