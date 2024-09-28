package Aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
//boa pratica: declarar classe, atributo e dpois os metodos


    double pegarConsumo (){
        System.out.println("Metodo com retorno obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel (double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}

