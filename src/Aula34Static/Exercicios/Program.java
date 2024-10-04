package Aula34Static.Exercicios;


public class Program {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {



        Contador.incrementar();
        System.out.println("===========");
        Contador.incrementar();
        Contador.incrementar();
        System.out.println("===========");
        System.out.println(Contador.obterValor());
        Contador.decrementar();
        System.out.println("===========");
        Contador.zerar();
        System.out.println("===========");
        System.out.println(Contador.obterValor());
        Contador.incrementar();
        System.out.println("===========");
        System.out.println(Contador.obterValor());
    }
}
