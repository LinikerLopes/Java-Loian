package TDominandoJavaExercicios;

import java.util.Scanner;

public class Exec12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a massa:  ");
        double massa = sc.nextDouble();

        System.out.println("Digite a velocidade: ");
        double velocidade = sc.nextDouble();

        double energiaCinetica = (massa *  (velocidade*velocidade)) / 2;
     //       double energiaCinetica = (massa * Math.pow(velocidade,2)) / 2;
        System.out.println("Energia cinetica: " + energiaCinetica);
    }
}
