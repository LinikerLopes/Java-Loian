package Aula43Object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

    private String curso;
    private double[] notas;

   /* public void verificarAcesso(){
        this.nomeVisibilidade = "doaskdosad";
        super.nomeVisibilidade = "dasdasodkas";
    }*/


    public Aluno(){
       // super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso){
       // super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    private double calcularMedia(){
        return 0;
    }

    private double verificarAprovado(){
        return 0;
    }

    //public void metodoQualquer(){
    //    super.setCpf("22551515151");
   // }


    public String obterEquiquetaEndereco(){ //soprepoe o da classe pessoa

        String s = "Endereco do Aluno: ";
       // s += super.getEndereco();

        return s;
        //return endereco;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo etq aluno: ");
        System.out.println(this.obterEquiquetaEndereco());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Objects.deepEquals(notas, aluno.notas);




    //@Override
    /*public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }*/
}}
