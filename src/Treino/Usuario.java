package Treino;

// Classe Usuario
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private List<Livro> livrosEmprestados;

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Métodos
    public void pegarEmprestado(Livro livro) {
        if (livro != null && livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.emprestar();
            System.out.println(nome + " pegou emprestado: " + livro.getTitulo());
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
            System.out.println(nome + " devolveu: " + livro.getTitulo());
        } else {
            System.out.println("Esse livro não está com " + nome);
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Livros Emprestados: ");
        for (Livro livro : livrosEmprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}

