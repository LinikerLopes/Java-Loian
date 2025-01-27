package ProjetosMadebyChatgpt;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora padrão");

        boolean opcao = false;

        while(!opcao){

            System.out.println("Escolha a operação: ");
            System.out.println("1 - Adição (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (x)");
            System.out.println("4 - Divisão (÷)");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.print("Digite sua opção: ");
            int selecao = sc.nextInt();

                if(selecao == 1){



                    System.out.println("Digite o primeiro número: ");
                    int num1 = sc.nextInt();
                    System.out.println();
                    System.out.println("Digite o segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println();

                    int resultado = num1 + num2;

                    System.out.println("A soma de " + num1 + " + " + num2 + " é igual a " + resultado);
                    System.out.println();
                }

            if(selecao == 2){



                System.out.println("Digite o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println();
                System.out.println("Digite o segundo número: ");
                int num2 = sc.nextInt();
                System.out.println();

                int resultado = num1 - num2;

                System.out.println("A subtração de " + num1 + " com " + num2 + " é igual a " + resultado);
                System.out.println();
            }

            if(selecao == 3){



                System.out.println("Digite o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println();
                System.out.println("Digite o segundo número: ");
                int num2 = sc.nextInt();
                System.out.println();

                int resultado = num1 * num2;

                System.out.println("A multiplição de " + num1 + " com " + num2 + " é igual a " + resultado);
                System.out.println();
            }

            if(selecao == 4){



                System.out.println("Digite o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println();
                System.out.println("Digite o segundo número: ");
                int num2 = sc.nextInt();
                System.out.println();

                int resultado = num1 / num2;

                System.out.println("A divisão de " + num1 + " com " + num2 + " é igual a " + resultado);
                System.out.println();
            }

            if(selecao == 5){

                System.out.println("Encerrando programa!");
                System.out.println("...");
                opcao = true;
            }

        }

    }
}
