package Aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    void exibirAutonomia (/*Aqui declara parâmetro*/){ //começa a declaracao do metodo com o tipo de retorno
                             // void - retorno sem nenhum valor
        System.out.println("A autonomia do carro é: " + consumoCombustivel * capCombustivel + " km." );

    }
}
