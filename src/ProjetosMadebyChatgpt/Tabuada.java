package ProjetosMadebyChatgpt;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada em Java");

        boolean opcao = false;

        while(!opcao){
            System.out.println("1 - Tabuada");
            System.out.println("2 - Sair");
            System.out.print("Selecione uma opcao: ");
                int selecao = sc.nextInt();
            System.out.println();
            if(selecao == 1){
                System.out.println("Digite o numero para verificar a tabuada");
                    int numeroEscolhido = sc.nextInt();
                System.out.println("Tabuada de " + numeroEscolhido);
                        for(int i = 0; i < 11; i++){
                            int result = numeroEscolhido * i;
                            System.out.println(numeroEscolhido + " x " + i + " = " + result);
                        }
                System.out.println();
            } else if(selecao == 2){
                opcao = true;
                System.out.println("Volte sempre");
            } else{
                System.out.println("opcao incorreta");
            }
        }

    }
}
