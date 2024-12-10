package Treino;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Bem vindo a Livraria do Guimmy");
        System.out.println("==============================");
        System.out.println();
        System.out.println("Nome de usuário: ");
        String nome = sc.nextLine();

        // Criando um usuário padrão para os testes
        Usuario usuario = new Usuario(nome);
        System.out.println();
        System.out.print("Bem vindo " +  usuario.getNome());

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Atualizar Livro");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Listar Livros");
            System.out.println("6 - Historico");
            System.out.println("7 - Exibir informação");
            System.out.println("8 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha restante

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o ano: ");
                    int ano = sc.nextInt();

                    Livro livro = new Livro(titulo, autor, ano);
                    biblioteca.adicionarLivro(livro);
                    break;

                case 2:
                    System.out.println("\n--- Atualizar Livro ---");
                    System.out.println("Digite o título do livro a atualizar: ");
                    String tituloAtualizar = sc.nextLine();
                    boolean livroEncontrado = false;

                    for (Livro l : biblioteca.getListaDeLivros()) {
                        if (l.getTitulo().equalsIgnoreCase(tituloAtualizar)) {
                            System.out.println("Digite o novo título: ");
                            l.setTitulo(sc.nextLine());
                            System.out.println("Digite o novo autor: ");
                            l.setAutor(sc.nextLine());
                            System.out.println("Digite o novo ano: ");
                            l.setAno(sc.nextInt());
                            livroEncontrado = true;
                            System.out.println("Livro atualizado com sucesso!");
                            break;
                        }
                    }

                    if (!livroEncontrado) {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Empréstimo de Livros ---");
                    System.out.println("Digite o título do livro a ser emprestado: ");
                    String tituloEmprestar = sc.nextLine();

                    for (Livro l : biblioteca.getListaDeLivros()) {
                        if (l.getTitulo().equalsIgnoreCase(tituloEmprestar) && l.isDisponivel()) {
                            biblioteca.registrarEmprestimo(usuario, l);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Devolução de Livros ---");
                    System.out.println("Digite o título do livro a ser devolvido: ");
                    String tituloDevolver = sc.nextLine();

                    for (Livro l : usuario.getLivrosEmprestados()) {
                        if (l.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                            usuario.devolverLivro(l);
                            biblioteca.registrarDevolucao(usuario, l);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Livros Disponíveis ---");
                    biblioteca.listarLivrosDisponiveis();
                    break;

                case 6:
                    System.out.println("Historico de emprestimos");
                    biblioteca.listarHistorico();
                    break;

                case 7:
                    System.out.println("Informação: ");
                   // livro.exibirInfo();
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 8);



    }
}
