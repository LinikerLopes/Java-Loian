package Aula37Heranca;

public class Aluno extends Pessoa{
    private String curso;
    private double[][] notas;

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

}
