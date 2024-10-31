package Aula24Exerc.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        String[][] disciplinas = new String[3][3];
        for (int i = 0; i < disciplinas.length; i++) {
            for (int j = 0; i < disciplinas[i].length; i++) {
                System.out.println("Digite o nome e disciplina: ");
                disciplinas[i][j] = sc.nextLine();


            }
        }
    }
}