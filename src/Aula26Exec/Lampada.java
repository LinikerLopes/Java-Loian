package Aula26Exec;

public class Lampada {

    boolean estado = true;


        void ligar(){
            estado = true;
        }
        void desligar(){
            estado = false;
        }

        void mudarEstado(){
            if(estado){
                System.out.println("Lampada esta ligada");
            }
            else{
                System.out.println("Lampada esta desligada");

            }
        }
    }

