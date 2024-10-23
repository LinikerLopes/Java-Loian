package Aula17Exec;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {

        String login;
        String senha;
        boolean troca = false;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Insira o login: ");
            login = sc.nextLine();
            System.out.println("Insira a senha: ");
            senha = sc.nextLine();

            if(login.equalsIgnoreCase(senha)){ // da correcao

                troca = false;
                System.out.println("Erro! Senha igual ao login.");
            }else{
                System.out.println("Conectado!");
                troca = true;
            }
        } while(!troca);

    }
}
