package Aula26.Exercicios;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PPM calculoPPM = new PPM();
        Scanner sc = new Scanner(System.in);

        System.out.println("Contagem de Paginas por Minuto (PPM)");
        System.out.println();

       /* System.out.println("Calcular PPL ");
        System.out.println("Digite o PPL (Numero de palavras nas 3 primeiras linhas: ");
        int Ppl = sc.nextInt();
        calculoPPM.contaPPP(Ppl);

        System.out.println();
        System.out.println("Digite o numero de linhas da página: ");
        double linhas = sc.nextDouble();
        calculoPPM.PPP(calculoPPM.contaPPP(Ppl), linhas);


        System.out.println();
        System.out.println("Digite o numero de paginas lidas: ");
        int numeroPaginasLidas = sc.nextInt();
        System.out.println(numeroPaginasLidas);
        System.out.println("Agora digite o tempo de leitura em minutos: ");
        int tempo = sc.nextInt();
        double PPm = calculoPPM.contaPPM(Ppl, tempo, numeroPaginasLidas);
        System.out.println(PPm);
*/
        System.out.println("Contagem de Paginas por Minuto (PPM)");
        System.out.println();

        // Entrada e cálculo de PPL
        System.out.print("Digite o PPL (Número de palavras nas 3 primeiras linhas): ");
        double Ppl = sc.nextDouble();
        double palavrasPorLinha = calculoPPM.contaPPL(Ppl);
        System.out.println("Palavras por linha (PPL): " + palavrasPorLinha);
        System.out.println();

        // Entrada para número de linhas e cálculo de PPP
        System.out.print("Digite o número de linhas da página: ");
        double linhas = sc.nextDouble();
        double palavrasPorPagina = calculoPPM.contaPPP(palavrasPorLinha, linhas);
        System.out.println("Palavras por página (PPP): " + palavrasPorPagina);
        System.out.println();

        // Entrada para número de páginas e tempo
        System.out.print("Digite o número de páginas lidas: ");
        double numeroPaginasLidas = sc.nextDouble();

        System.out.print("Agora digite o tempo de leitura em minutos: ");
        double tempo = sc.nextDouble();

        // Cálculo final de PPM
        double PPm = calculoPPM.contaPPM(palavrasPorPagina, numeroPaginasLidas, tempo);
        System.out.println();

        System.out.println();
        System.out.println("Seu PPM na leitura nesses " + tempo + " minutos foi de " + PPm + " ppm");




    }
}
