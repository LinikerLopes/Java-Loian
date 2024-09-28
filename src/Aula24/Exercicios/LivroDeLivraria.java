package Aula24.Exercicios;
public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Harry Potter e o prisioneiro de Azkaban";
        livro.autor = "J.K. Rowling";
        livro.editora = "Rocco";
        livro.anoPublicacao = 2000;
        livro.paginas = 288;
        System.out.println(livro.titulo);
    }
}
