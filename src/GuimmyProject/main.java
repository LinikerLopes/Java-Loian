package GuimmyProject;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();
        dados.saudacao();

            dados.menu();
            int opcao = sc.nextInt();

            dados.menu(opcao);

       /* Livro livro = new Livro();

        livro.nome = "HP";
        livro.autor = "JK";
        livro.anoPublicacao = 2000;

       livro.exibirInfo();*/
    }
}
