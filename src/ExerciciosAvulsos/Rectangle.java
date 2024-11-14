package ExerciciosAvulsos;

public class Rectangle {

    double Width;
    double Height;
    double area;
    double perimeter;
    double diagonal;

    void areaRectangle() {
        area = Width * Height;
        System.out.println(area);
    }

    void perimeter() {
        perimeter = 2*(Width + Height);
        System.out.println(perimeter);
    }

    void diagonal() {
        diagonal = Math.sqrt(Width * Width + Height * Height);
        System.out.println(diagonal);
    }
}
