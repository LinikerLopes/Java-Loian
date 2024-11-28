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

        boolean opcao = false;
        while (!opcao) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastro de livro");
            System.out.println("2 - Alugar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Exibir informacao livro");
            System.out.println("5 - Sair");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                sc.nextLine();


            } else if (escolha == 2) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                String infoLivro = sc.nextLine();
            } else if (escolha == 3) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                String infoLivro = sc.nextLine();
            } else if (escolha == 4) {
                System.out.println("Digite o Nome/ISBN do livro: ");
                sc.nextLine();
                String input = sc.nextLine();
                classe.dados(input);
            } else if (escolha == 5) {
                System.out.println("Obrigado por utilizar nossos serviços.");
                System.out.println("Ate a próxima!");
                System.out.println("Livraria do Guimmy");
                opcao = true;
            } else {
                System.out.println("Opção inválida. Por favor digitar uma opção válida");
            }

       /* Livro livro = new Livro();

        livro.nome = "HP";
        livro.autor = "JK";
        livro.anoPublicacao = 2000;

       livro.exibirInfo();*/
        }
    }
}
