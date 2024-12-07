package CRUD;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado " + livro);
    }

    public List<Livro> listaLivros(){
        return livros;
    }

}
