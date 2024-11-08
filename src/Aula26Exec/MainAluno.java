package Aula26Exec;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Colégio JWYA");
        System.out.println("Preencha seus dados para continuar");

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Matricula: ");
        aluno.matricula = sc.nextLine();
        System.out.print("Curso: ");
        aluno.curso = sc.nextLine();
        System.out.println();

        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Escreva o nome da discipliona");
            aluno.disciplinas[i] = new String[]{sc.nextLine()};
        }
        for (int i = 0; i < aluno.disciplinas.length; i++){
            for (int j = 0; j < aluno.disciplinas[i]. length;j++){
                System.out.println("Digite a nota: ");
                aluno.disciplinas[i][j] = sc.nextLine();
            }
        }

            aluno.dadosPessoais();


    }
}

