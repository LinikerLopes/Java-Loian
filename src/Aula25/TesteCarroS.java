package Aula25;

public class TesteCarroS {

    String modelo;
    String marca;
    int ano;
    int passageiros;
    int tanqueCombustivel;
    int consumoCombustivel;

    void autonomia(){
        System.out.println("A autonmia do carro é de: " + tanqueCombustivel * consumoCombustivel + " km com tanque cheio");
    }

    double obterAutonomia(){
        return tanqueCombustivel * consumoCombustivel;
    }

    double calcularCombustivel (double km){
        return km*consumoCombustivel;
    }
}
