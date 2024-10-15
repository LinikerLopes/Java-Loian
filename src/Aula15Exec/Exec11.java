package Aula15Exec;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá. Digite seu salario bruto: ");
        double salario = sc.nextDouble();

        int percentual = 0;
        if(salario <= 280){
            percentual = 20;
        }else if(salario > 281 && salario <= 699){
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
           percentual = 10;

        }else if(salario >= 1500){
            percentual = 5;
        }

        double porcentagem = (salario/100) * percentual;
        double novoSalario = porcentagem + salario;

        System.out.println("Salario atual: " + salario);
        System.out.println("Porcentagem de aumento: " + percentual + " %");
        System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);





// erros de gravacao

       /* switch(salario){
            case 280:
                double aumento = 20;
                double porcentagem = (aumento/salario) * 100;
                double novoSalario = porcentagem + salario;

                System.out.println("Salario atual: " + salario);
                System.out.println("Porcentagem de aumento: " + aumento + " %");
                System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
                System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

                break;


        System.out.println("Salario bruto  = " + salario);
                System.out.println(" ");


                if(salario <= 280){
            salario += (20/100) *100;
            System.out.println(salario + "1");
        }else if(salario > 281 && salario <= 699){
            salario += (15/100) * 100;
            System.out.println(salario + "2");
        } else if (salario >= 700 && salario < 1500) {
            salario += (10/100)*100;
            System.out.println(salario + "3");

        }else{
            salario += (5/100) * 100;
            System.out.println(salario + "4");
        }
*/
    }
}
