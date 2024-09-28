package Aula24.Exercicios;

public class Exercicio {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.conta = 103179;
        conta.saldo = 139.00;
        conta.especial = false;
        conta.limite = 2000.00;

        Contato contato = new Contato();

        contato.nome = "Merlin";
        contato.apelido = "O mago";
        contato.numero = 999999999;

        Lampada lampada = new Lampada();

        lampada.marca = "elgin";
        lampada.tipo = "bulbo retro";
        lampada.preco = 34.50;
        lampada.kw = 10;
        lampada.consumoEnergiaHora = 1.0;



    }
}
