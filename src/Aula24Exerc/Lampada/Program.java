package Aula24Exerc.Lampada;

public class Program {
    public static void main(String[] args) {

        Exec1 lampada = new Exec1();

        lampada.desligado();

        System.out.println("Lampada esta? " + lampada.ligadoDesligado);

    }
}