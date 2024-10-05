package Aula36RelacionamentoClasses.Exercicios;

import Aula36RelacionamentoClasses.Telefone;

public class Agenda {
    private String nome;

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    private Contato[] contatos;

    public Agenda(){}

    public Agenda(String nome){
        this.nome = nome;
    }


}
