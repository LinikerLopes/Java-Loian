package Aula24Exerc.Aluno;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[][] disciplinas = new String[3][3];

    /*

        verificar nota:

        if(media >= 7){
        System.out.println("Aprovado.");
        } else{
        System.out.println("Reprovado");
        }
     */
    void info(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(curso);
        System.out.println(disciplinas);
    }

}
