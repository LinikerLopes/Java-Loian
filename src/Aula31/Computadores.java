package Aula31;

public class Computadores {

    String modelo;
    String marca;
    int anoFabricacao;
    double preco;
    double precoConsumo;
    private double consumoEnergia;

    void exibirAutonomia(){
        System.out.println("A autonomia do computador é " +  this.precoConsumo + this.consumoEnergia + " .");
    }
}
