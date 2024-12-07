package CRUD;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Livro (int id, String titulo, String autor, String ano){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [id = " + id + ", titulo = " + titulo + ", autor = " + autor + ", ano = " +ano + "]";
    }
}
