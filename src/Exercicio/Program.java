package Exercicio;
import java.util.Locale;
import java.util.Scanner;
import Exercicio.Student;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
Student student = new Student();

        System.out.println("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Notas: ");
            student.grade1 = sc.nextDouble();
            student.grade2 = sc.nextDouble();
            student.grade3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("Você nao passou!");
            System.out.printf("Faltou: %.2f%n", student.missingPoint());
        } else{
            System.out.println("Você passou!!");
        }
    }
}
