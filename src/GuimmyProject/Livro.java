package GuimmyProject;

public class Livro {
    //atributos

    String nome;
    String autor;
    int anoPublicacao;
    boolean disponivel;

    //métodos

        //emprestar
    boolean emprestarLivro(){
        //aqui mudar estado de disponivel para false
        return true;
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

    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }




}
