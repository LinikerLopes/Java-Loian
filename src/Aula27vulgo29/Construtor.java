package Aula27vulgo29;

public class Construtor {
String marca;
String modelo;
String ano;
   /* Construtor(String marca_){
        System.out.println("Classe 1");
    }*/

    public Construtor(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        System.out.println("Construtor com 3");
    }

    public Construtor(String marca, String modelo){
        this(marca, modelo, "2010");
        System.out.println("Construtor com 2");
    }
}
