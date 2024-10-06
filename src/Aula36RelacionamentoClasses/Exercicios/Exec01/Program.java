package Aula36RelacionamentoClasses.Exercicios.Exec01;
//https://www.slideshare.net/slideshow/curso-java-basico-exercicios-aula-36/52866993

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da agenda: ");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contato = new Contato[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Digite as informações do contato: " + (i+1));
            Contato c= new Contato();
            System.out.println("Entre com o nome: ");
            nome = sc.nextLine();
            c.setNome(nome);
            System.out.println("Entre com o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);
            System.out.println("Entre com o email: ");
            String email = sc.nextLine();
            c.setEmail(email);

            contato[i] = c;
        }
        agenda.setContatos(contato);

        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }


        System.out.println(nome);



    }
}
