package ProjetosMadebyChatgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();

        System.out.println("Lista de 5 Tarefas ");

        boolean opcao = false;

        while(!opcao){

            System.out.println("Selecione a opção desejada abaixo: ");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Editar tarefa");
            System.out.println("3 - Excluir tarefa");
            System.out.println("4 - Verificar tarefa por posição na lista");
            System.out.println("5 - Exibir todos as tarefas");
            System.out.println("6 - Sair");
            System.out.println();
            System.out.print("Digite sua opção: ");
            int selecao = sc.nextInt();

            if (selecao == 1){
                sc.nextLine();
                System.out.println("Digite o nome da tarefa:");
                String taskName = sc.nextLine();
                System.out.println();

                tarefas.add(taskName);

                System.out.println();
                System.out.println("Tarefa - " + taskName + " - adicionada com sucesso...");
            }

            if (selecao == 2){

                System.out.println("Digite a posição da tarefa na lista: ");
                int taskPositionList = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome da tarefa:");
                String taskName = sc.nextLine();
                System.out.println();

                tarefas.set(taskPositionList, taskName);

                System.out.println();
                System.out.println("Tarefa editada com sucesso...");
            }

            if (selecao == 3){
                System.out.println("Digite a posição da tarefa na lista: ");
                int taskPositionList = sc.nextInt();
                String taskDeleted = tarefas.get(taskPositionList);

                tarefas.remove(taskPositionList);

                System.out.println("Tarefa - " + taskDeleted + " - foi excluida com sucesso.");
                System.out.println();
            }

            if (selecao == 4){
                System.out.println("Digite a posição da tarefa na lista: ");
                int taskPositionList = sc.nextInt();

                if(taskPositionList < tarefas.size()) {
                    System.out.println(tarefas.get(taskPositionList));

                    System.out.println();
                }else{
                    System.out.println("Não existe elemento nessa posição. Tente outra vez");
                    System.out.println();
                }
            }

            if(selecao == 5){
                System.out.println("Lista de Tarefas cadastradas: ");
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.print((i) + " - ");
                    System.out.println(tarefas.get(i));
                }
            }

            if(selecao == 6){
                opcao = true;
                System.out.println("Programa encerrado");
            }

        }

    }
}
