package Aula26.Exercicios;

import java.util.Scanner;

public class TesteExercicio {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.modelo = "Bulbo";
        lampada.marca = "Elgin";
        lampada.kw = 10;

        lampada.ligado = false;

        lampada.ligar();

        lampada.mostrarEstado();
            }
            }

            //Minha logica
/*if(lampada.ligado == false){
        System.out.println("Desejar ligar a lâmpada? 0 - sim; 1 - não");
            int interruptor = sc.nextInt();
            if(interruptor == 0){
                lampada.ligado = true;
                System.out.println("lampada ligada");
            }else{
                System.out.println("Lampada continuara desligada");
            }*/