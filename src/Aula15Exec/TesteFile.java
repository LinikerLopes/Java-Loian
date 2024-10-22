package Aula15Exec;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteFile {
        public static void main(String[] args) throws IOException {

            int n1;
            String garcom;
            double soma = 0;

            String filePath = "soma_acumulada.txt"; // chatgpt
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite nome do garçom: ");
            garcom = sc.nextLine();
            System.out.println("Digite quantidade de contas: ");
            n1 = sc.nextInt();

            try (FileWriter writer = new FileWriter(filePath)) { // chatgpt
                for (int i = 0; i < n1; i++) {
                    System.out.println("Digite valor da conta: " + (i + 1));
                    double num1 = sc.nextDouble();
                    soma += num1;

                    writer.write("R$" + num1 + "\n"); //chatgpt
                }
                writer.write("Soma total: " + soma + "\n"); // Escreve a soma total ao final --  chatgpt
                writer.write("Garçom: " + garcom + "\n"); //chatgpt

                System.out.println("Garcom: "+ garcom);
                System.out.println("Total das contas: " + soma);
            }
        }
    }
