package Aula26.Exercicios;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplina;
    double[][] nota = new double[3][4];



    void exibirInfo (){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for(int i= 0; i < nota.length; i++){
            System.out.println("Nota da disciplina " + disciplina[i]);
            for (int j = 0; j < nota[i].length; j++){
                System.out.print(nota[i][j] + " ");
            }
            System.out.println();
        }
    }
}
