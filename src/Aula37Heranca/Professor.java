package Aula37Heranca;

public class Professor extends Pessoa{
    private String departamento;
    private String nomeCurso;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    private double calcularSalarioLiquido(){
        return 0;
    }
}
