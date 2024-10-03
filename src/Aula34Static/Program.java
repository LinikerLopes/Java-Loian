package Aula34Static;

public class Program { //65
    static int result;
    public static void main(String[] args) {
// exercicio https://pt.slideshare.net/slideshow/curso-java-basico-exercicios-aula-34/52866965
      //  MinhaCalculadora calc = new MinhaCalculadora(); - nao precisa chamar quando se usa STATIC

        int soma1 = MinhaCalculadora.soma(1,2);
        System.out.println(soma1);
        int soma2 = MinhaCalculadora.soma(9,2,3);
        System.out.println(soma2);
    }
}
