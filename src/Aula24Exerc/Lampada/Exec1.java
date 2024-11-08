package Aula24Exerc.Lampada;

public class Exec1 {

    boolean ligado = true;

    void ligar(){
        ligado = true;
    }
    void desligar(){
        ligado = false;
    }
    void mudarEstado(){
        if(ligado){
            ligado = true;
        }
        else{
            ligado = false;
        }
    }
}
