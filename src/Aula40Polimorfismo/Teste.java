package Aula40Polimorfismo;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 500");
        professor.setEndereco("Rua 5, num 4");

        System.out.println(pessoa.obterEquiquetaEndereco());
        System.out.println(aluno.obterEquiquetaEndereco());
        System.out.println(professor.obterEquiquetaEndereco());
    }
}
