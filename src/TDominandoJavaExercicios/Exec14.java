package TDominandoJavaExercicios;

import Aula26Exec.Main;

public class Exec14 {
    public static void main(String[] args) {

        double x1 = 10;
        double y1 = 5;
        double x2 = 5;
        double y2 = 3;

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distancia é: " + distancia);
    }
}
