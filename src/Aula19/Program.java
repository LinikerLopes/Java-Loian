package Aula19;

public class Program{
    public static void main(String[] args) {
        String[] nome = new String[5];
        nome[1] = "John";
        nome[2] = "Ricardo";

        /*for (int i = 0; i < nome.length; i++){
            System.out.println("Posicao da array: " + i + " - " + nome[i]);*/

        for (String apelido : nome){
            System.out.println(apelido);
        }
        }
    }

