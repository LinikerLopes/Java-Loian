package Aula26.Exercicios;

public class Lampada {
    String modelo;
    String marca;
    int kw;
    boolean ligado;

    void ligar(){
        ligado = true;
    }

    void desligar(){
        ligado = false;
    }

    void mostrarEstado(){
        if(ligado){
            System.out.println("Lampada desligada");
            }else{
                System.out.println("Lampada ligada");
            }
    }

    void mudarEstado(){
        if(ligado){
            desligar();
        } else{
            ligar();
        }

    }
}
