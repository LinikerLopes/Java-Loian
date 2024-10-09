package Aula42Final;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();


        System.out.println(aluno.obterEquiquetaEndereco());
        System.out.println(professor.obterEquiquetaEndereco());

    }
}
