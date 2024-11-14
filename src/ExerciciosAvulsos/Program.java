package ExerciciosAvulsos;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Heigth");
        rectangle.Height = sc.nextDouble();
        System.out.println("Width");
        rectangle.Width = sc.nextDouble();

        rectangle.areaRectangle();
        rectangle.perimeter();
        rectangle.diagonal();



    }
}
