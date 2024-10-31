package GuimmyProject;

public class Dados {

    void saudacao(){
        System.out.println("Bem vindo a Livraria do Guimmy");
        System.out.println("==============================");
    }
    void menu(){
        System.out.println();
        System.out.println("Selecione uma opção: ");
        System.out.println("1-: ");
        System.out.println("2-: ");
        System.out.println("3-: ");
        System.out.println("4-: ");
        System.out.println("5-: ");
    }
    int menu (int opcao){
        switch(opcao){
            case 1:
                System.out.println("opcao 1");
                break;
            case 2:
                System.out.println("opcao 2");
                break;
            case 3:
                System.out.println("opcao 3");
                break;
            case 4:
                System.out.println("opcao 4");
                break;
            case 5:
                System.out.println("opcao 5");
                break;
            default:
                System.out.println("Opção invalida");
                System.out.println("Selecione novamente uma opção válida");
        }
        return opcao;
    }
}
