package Aula33Exec;

public class Lampada implements iLampada{

   private boolean mudarEstado = false;

    @Override
    public void ligar() {
    mudarEstado = true;
        System.out.println("Lampada ligada");
    }
    @Override
    public void desligar() {
        mudarEstado = false;
        System.out.println("Lampada desligada");
    }
}
