package Agenda;

public class main {
    public static void main(String[] args) {

        Compromisso compromisso = new Compromisso();
        Agenda agenda = new Agenda();

        compromisso.setDescricao("Comer panqueca");

        System.out.println(compromisso.getDescricao());


    }
}
