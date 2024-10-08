package Aula37Heranca;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nomeS = sc.nextLine();

        aluno.setNome(nomeS);
        System.out.println("Nome: " + aluno.getNome());
    }
}
