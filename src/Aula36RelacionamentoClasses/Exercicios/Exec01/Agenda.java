package Aula36RelacionamentoClasses.Exercicios.Exec01;

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

        public String obterInfo(){
            String info = "Nome = " + nome + "\n";

            if(contatos != null){
                for(Contato c : contatos){
                    info += c.obterInfo() + "\n";
                }
            }

            return info;
        }
}
