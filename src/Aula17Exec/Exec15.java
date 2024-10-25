package Aula17Exec;

import java.util.Scanner;

public class Exec15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um termo: ");
        int n = sc.nextInt();

        int primeiro  = 1;
        int segundo = 1;
        int proximo = 0;
        for(int i = 0; i < n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println(proximo);
    }
}
