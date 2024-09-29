package GuimmyProject;

public class Program {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "HP";
        livro.autor = "JK";
        livro.anoPublicacao = 2000;

       livro.exibirInfo();
    }
}
