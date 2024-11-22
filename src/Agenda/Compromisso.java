package Agenda;

public class Compromisso {

    private String dia;
    private String mes;
    private String hora;
    private String descricao;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void compromisso(String dia, String mes, String hora, String descricao){
            this.dia = dia;
            this.mes = mes;
            this.hora = hora;
            this.descricao = descricao;
    }

}
