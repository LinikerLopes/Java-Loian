package Aula27vulgo29;

public class Encap {

    private String name;
    private double price;
    private int quantity = 10;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
}
