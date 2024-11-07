package Aula25;

public class Carro2 {
    public static void main(String[] args) {

        TesteCarroS van = new TesteCarroS();

        van.modelo = "compacto";
        van.marca = "volks";
            van.tanqueCombustivel = 50;
            van.consumoCombustivel = 16;
        System.out.println("Modelo e marca da van: " + van.modelo + " e " + van.marca);

        van.autonomia();

        double autonomo = van.obterAutonomia();

        System.out.println("A autonomia da van é de: " + autonomo);

        double km = van.calcularCombustivel(20);

        System.out.println(km);
    }
}
