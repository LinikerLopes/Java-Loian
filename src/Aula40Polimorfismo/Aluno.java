package Aula40Polimorfismo;

public class Aluno extends Pessoa {
    private String curso;
    private double[][] notas;

public void verificarAcesso(){
    this.nomeVisibilidade = "doaskdosad";
    super.nomeVisibilidade = "dasdasodkas";
}


    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    private double calcularMedia(){
        return 0;
    }

    private double verificarAprovado(){
        return 0;
    }

    public void metodoQualquer(){
        super.setCpf("22551515151");
    }


    public String obterEquiquetaEndereco(){ //soprepoe o da classe pessoa

            String s = "Endereco do Aluno: ";
            s += super.getEndereco();

            return s;
        //return endereco;
    }

}


