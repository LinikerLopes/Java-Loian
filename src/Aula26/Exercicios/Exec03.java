package Aula26.Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
Aluno aluno = new Aluno();
        System.out.println("Nome do aluno: ");
        aluno.nome = sc.next();
        System.out.println("Curso: ");
        aluno.curso = sc.next();

        System.out.println("Matricula (somente números): ");
        aluno.matricula = sc.next();
        System.out.println();

        aluno.disciplina = new String[3];

        for(int i = 0; i < aluno.disciplina.length; i++){
            System.out.println("Entre com o nome das disciplinas " + (i+1));
            aluno.disciplina[i] = sc.next();
            System.out.println();
        }

        for (int i = 0; i < aluno.nota.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplina[i]);

                for(int j = 0; j < aluno.nota[i].length; j++){
                    System.out.println("Entre com a nota " + (j+1));
                        aluno.nota[i][j] = sc.nextDouble();
                    System.out.println();
                }
        }
        System.out.println();
        aluno.exibirInfo();


    }
}
