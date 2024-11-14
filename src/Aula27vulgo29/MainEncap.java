package Aula27vulgo29;

import java.util.Scanner;

public class MainEncap {
    public static void main(String[] args) {

        Encap encap = new Encap();
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        sc.nextLine();
        String name = sc.nextLine();
        encap.setName(name);
        System.out.println(encap.getName());
        encap.setPrice(price);
        System.out.println(encap.getPrice());
        System.out.println(encap.getQuantity());
    }
}
