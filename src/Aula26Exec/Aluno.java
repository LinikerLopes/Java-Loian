package Aula26Exec;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[][] disciplinas = new String[3][3];

    void dadosPessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);

        for(int i = 0; i < disciplinas.length; i++){
            for (int j = 0; j < disciplinas[i].length; j++){
                System.out.print(disciplinas[i][j] + " ");
            }
        }
    }
   /* double notas(double score){

    }*/
}
