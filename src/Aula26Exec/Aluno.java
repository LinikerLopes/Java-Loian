package Aula26Exec;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[4][3];

    void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);

        for(int i = 0; i < disciplinas.length; i++){
            System.out.print("| "+disciplinas[i] + " |");
            }
        System.out.println();
        for(int i= 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                System.out.print("| "+notas[i][j] + " |");
            }
            System.out.println();
        }
        }

    }
   /* double notas(double score){

    }*/
