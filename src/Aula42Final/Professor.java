package Aula42Final;

public class Professor{
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

public String obterEquiquetaEndereco(){  // ======= polimorfismo em tempo de execucao
        String s = "Endereco do Professor: ";
      //  s += super.getEndereco();
        return s;
}

   // @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo etq professor: ");
        System.out.println(this.obterEquiquetaEndereco());
    }

    private double calcularSalarioLiquido(){
        return 0;
    }
}
