package Aula43Object;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da computacao");
        double[] notas={10,1,3,4};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "Abacate";
        String s2 = "Abacate";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciencia da computacao");
        double[] notas2 = {11,12,13,11};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}