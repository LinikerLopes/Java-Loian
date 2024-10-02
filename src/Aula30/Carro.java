package Aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(){ }

    public Carro(String marca /*e esse narca é o parametro*/, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca; // deixa explicito que esse this.marca é um atributo da classe
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parametros");

    }
    public Carro (String marca, String modelo){
        this(modelo, marca, 10);
        System.out.println("Chamando o construtor com 2 parametros");
    }

    public Carro(String modelo, String marca, int i) {
    }
}

