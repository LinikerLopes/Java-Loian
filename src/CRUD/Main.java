package CRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);

            int opcao;
        do{
            System.out.println();
            System.out.println("====== MENU ======");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livro");
            System.out.println("3 - Atualizar livro");
            System.out.println("4 - Remover Livro");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opcao: " );
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("id: "); // id, titulo, autor, ano sobrecarga
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("titulo: ");
                String titulo = sc.nextLine();
                System.out.println("autor: ");
                String autor = sc.nextLine();
                System.out.println("ano: ");
                String ano = sc.nextLine();
                Livro livro = new Livro(id, titulo, autor, ano);
                biblioteca.adicionarLivro(livro);

            } else if (opcao == 2) {
                System.out.println("Lista de livros: "); //id, titulo, autor, ano
                    for(Livro l : biblioteca.listaLivros()){
                        System.out.println(l);
                    }
            } else if (opcao == 3) {
                System.out.println("Terça"); //id

            } else if (opcao == 4) {
                System.out.println("Quarta");//id
            } else if (opcao == 5) {
                System.out.println("Obrigado por usar nossos serviços");
            } else {
                System.out.println("Numero invalido");
            }
        } while(opcao != 5);
    }
}
