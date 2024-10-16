package Aula15Exec;


import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String message = "Programa encerrado";
        double a;
        double b = 0;
        double c = 0;

        System.out.println("Digite valor de a:");
            a = sc.nextDouble();
            if(a == 0){
                System.out.println(message);
            }else {
                System.out.println("Digite valor de b:");
                b = sc.nextDouble();
                System.out.println("Digite valor de c:");
                c = sc.nextDouble();

                double delta = (b*b) - (4*a) * c;

                if(delta < 0){
                    System.out.println(message);
                    System.out.println("Não possui raizes reais");
                    System.out.println("Valor de delta: " + delta);
                } else if (delta == 0) {
                    System.out.println("Equação possui uma raiz real");
                    System.out.println("Valor de delta: " + delta);
                    double quadrado = Math.sqrt(delta);
                    System.out.printf("raiz de delta: %.2f\n", quadrado);

                        double calc1 = (-(b) + quadrado) / 2;
                    System.out.println(calc1);
                        double calc2 = (-(b) - quadrado) / 2;
                    System.out.println(calc2);

                }else if(delta > 1){
                        System.out.println("Equação possui duas raizes reais");
                        System.out.println("Valor de delta: " + delta);
                    double quadrado = Math.sqrt(delta);
                        System.out.printf("raiz de delta: %.2f\n", quadrado);

                        double calc1 = (-(b) + quadrado) / 2;
                    System.out.println(calc1);
                        double calc2 = (-(b) - quadrado) / 2;
                    System.out.println(calc2);
                }
            }

            // ====================codigo usado para pensar
            //if-else

       /* double delta = (b*b) - (4*a) * c;
        if(delta < 0){
            System.out.println(message);
            System.out.println("Não possui raizes reais");
            System.out.println("Valor de delta: " + delta);
        } else if (delta == 0) {
            System.out.println("Equação possui uma raiz real");
            System.out.println("Valor de delta: " + delta);
            double quadrado = Math.sqrt(delta);
            System.out.println("raiz de delta: "+ quadrado);
        }else if(delta > 1){
            System.out.println("Equação possui duas raizes reais");
            System.out.println("Valor de delta: " + delta);
            double quadrado = Math.sqrt(delta);
            System.out.println("raiz de delta: "+ quadrado);*/
        }
    }


//formula de báskara
/*
*   ax² +bx + c
* x = -b +- (raiz de b² - 4.a.c)/ 2a
*
*
*
*
*
*
*
*
*
*
*
* */