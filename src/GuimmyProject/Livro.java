package GuimmyProject;

public class Livro {
    //atributos

    String nome;
    String autor;
    int anoPublicacao;
    boolean disponivel;

    //métodos

        //emprestar
    void emprestarLivro(){
        //aqui mudar estado de disponivel para false
    }
        //devolver
    void devolverLivro(){
        //aqui mudar estado de disponivel para true
}
        //exibirInfo

    void exibirInfo(){
        System.out.println("Título do livro: " + nome);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Ano de publicação do Livro: " + anoPublicacao);
    }


}
