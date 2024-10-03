package Aula33Sobrecarga;

public class Program {
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();

        int[] vetor = {5,2,9};

        int resultado = calculadora.some(vetor);

        System.out.println(resultado);

        System.out.println("==========");
        System.out.println(calculadora.soma(10,10));
    }
}
