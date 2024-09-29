package Aula26;

public class TesteCarro {
    public static void main(String[] args) {
        Aula26.Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        double autonomia = van.pegarConsumo();

        System.out.println("A autonomia do carro é " + autonomia);

        double qtdCombustivel = van.calcularCombustivel(10);

        van.infoCarros();

        System.out.println("qtd combustivel " + qtdCombustivel);
    }

}

