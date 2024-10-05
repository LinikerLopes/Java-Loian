package Aula36RelacionamentoClasses;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;


    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
