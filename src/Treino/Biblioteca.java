package Treino;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaDeLivros; // arraylist
    private List<String> historicoEmprestimos;
    private static final String FILE_NAME = "biblioteca.json";

    // Construtor
    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
        this.historicoEmprestimos = new ArrayList<>();
        carregarDados(); // Carregar dados do arquivo JSON ao iniciar
    }

    // Métodos
    public void adicionarLivro(Livro livro) {
        listaDeLivros.add(livro);
        salvarDados(); // Salvar os dados após adicionar o livro
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : listaDeLivros) {
            if (livro.isDisponivel()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

    public void registrarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            usuario.pegarEmprestado(livro);
            historicoEmprestimos.add(usuario.getNome() + " pegou emprestado " + livro.getTitulo());
            salvarDados(); // Salvar os dados após o empréstimo
            System.out.println("Empréstimo registrado com sucesso.");
        } else {
            System.out.println("Livro não disponível para registro de empréstimo.");
        }
    }

    public void registrarDevolucao(Usuario usuario, Livro livro) {
        if (!livro.isDisponivel()) {
            usuario.devolverLivro(livro);
            historicoEmprestimos.add(usuario.getNome() + " devolveu o livro  " + livro.getTitulo());
            salvarDados(); // Salvar os dados após o empréstimo
            System.out.println("Devolução registrado com sucesso.");
        } else {
            System.out.println("Livro não disponível para registro de devolução.");
        }
    }

    public void listarHistorico() {
        System.out.println("Histórico de empréstimos:");
        for (String registro : historicoEmprestimos) {
            System.out.println("- " + registro);
        }
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    // Persistência de Dados
    private void salvarDados() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            Gson gson = new Gson();

            // Criando um objeto contendo os livros e o histórico
            BibliotecaData data = new BibliotecaData(listaDeLivros, historicoEmprestimos);
            gson.toJson(data, writer);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    private void carregarDados() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Gson gson = new Gson();

            // Carregar a estrutura que contém os livros e o histórico
            Type dataType = new TypeToken<BibliotecaData>() {}.getType();
            BibliotecaData data = gson.fromJson(reader, dataType);

            if (data != null) {
                this.listaDeLivros = data.getListaDeLivros();
                this.historicoEmprestimos = data.getHistoricoEmprestimos();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum arquivo encontrado. Inicializando com dados vazios.");
        } catch (IOException e) {
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }

    // Classe auxiliar para estruturar os dados do arquivo JSON
    private static class BibliotecaData {
        private List<Livro> listaDeLivros;
        private List<String> historicoEmprestimos;

        // Construtor
        public BibliotecaData(List<Livro> listaDeLivros, List<String> historicoEmprestimos) {
            this.listaDeLivros = listaDeLivros;
            this.historicoEmprestimos = historicoEmprestimos;
        }

        // Getters
        public List<Livro> getListaDeLivros() {
            return listaDeLivros;
        }

        public List<String> getHistoricoEmprestimos() {
            return historicoEmprestimos;
        }
    }
}
