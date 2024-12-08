package GuimmyProject;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        dados.saudacao();

        ClasseTesteAPI classe = new ClasseTesteAPI();

        int opcao;
        do {


            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastro de livro");
            System.out.println("2 - Alugar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Lista de livros");
            System.out.println("5 - Exibir informacao livro");
            System.out.println("6 - Sair");
            System.out.print("Digite o número correspondente: ");
            opcao = sc.nextInt();
            System.out.println();

            if (opcao == 1) {
                System.out.println("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("nome: ");
                String nome= sc.nextLine();
                System.out.println("autor: ");
                String autor = sc.nextLine();
                System.out.println("ano: ");
                int anoPublicacao = sc.nextInt();
                Livro livros = new Livro(id, nome, autor, anoPublicacao);
                System.out.println();
                  //  livros.exibirInfo(); //vai retornar oq adicionei
                System.out.println();
                sc.nextLine();


            } else if (opcao == 2) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                String infoLivro = sc.nextLine();
            }
            else if (opcao == 3) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                String infoLivro = sc.nextLine();
            }
            else if (opcao == 4) {
                System.out.println("Ainda em falta");
            }
            else if (opcao == 5) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                sc.nextLine();
                String input = sc.nextLine();
                classe.dados(input);
            } else if (opcao == 6) {
                System.out.println("Obrigado por utilizar nossos serviços.");
                System.out.println("Ate a próxima!");
                System.out.println("Livraria do Guimmy");
            } else {
                System.out.println("Opção inválida. Por favor digitar uma opção válida");
            }

       /* Livro livro = new Livro();

        livro.nome = "HP";
        livro.autor = "JK";
        livro.anoPublicacao = 2000;

       livro.exibirInfo();*/
        } while (opcao != 6) ;
    }
}
