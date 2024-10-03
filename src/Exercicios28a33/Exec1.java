package Exercicios28a33;

public class Exec1 {
    //Lampada

       private String modelo;
       private String marca;
       private int potencia;
       private String cor;
       private String tipoLuz;
       private boolean tipoAbajur;
       private boolean ligada;

    public Exec1(){
    }

    public Exec1(String modelo, String marca, int potencia, String cor, String tipoLuz, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if(isLigada()){
            System.out.println("Lampada ligada");
        } else{
            System.out.println("Lampada esta desligada");
        }
    }

    public void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
