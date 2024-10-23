package Aula17Exec;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String sexo;
        String nome;
        int idade;
        double salario;
        String estadoCivil;
        boolean validar = false;

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
                if(nome.length() > 3){
                    validar = true;
                }else{
                    System.out.println("Nome invalido. Digite novamente com 3 caracteres ou mais");
                }
        }while(!validar);

        do{
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            if(idade >= 0 &&  idade <= 150){
                validar = true;
            }else{
                System.out.println("Idade invalido. Digite novamente!");
                validar = false;
            }
        }while(!validar);

        do{
            System.out.println("Digite seu salario: ");
            salario = sc.nextDouble();
            if(salario > 0){
                validar = true;
            }else{
                System.out.println("Salario negativo. Digite novamente!");
                validar = false;
            }
        }while(!validar);
sc.nextLine();


        do{
            System.out.println("Digite seu sexo: ");
            sexo = sc.nextLine();
            if(sexo.equalsIgnoreCase("m")){
                validar = true;
            } else if(sexo.equalsIgnoreCase("f")){
                validar = true;

            } else{
                System.out.println("Opcao digitada incorreta. Digite novamente!");
                validar = false;
            }
        }while(!validar);

        do{
            System.out.println("Digite seu estado civil: ");
            System.out.println("s - solteiro/a");
            System.out.println("c - casado/a");
            System.out.println("d - divorciado/a");
            System.out.println("v - viuvo/a");

            estadoCivil = sc.nextLine();
            if(estadoCivil.equalsIgnoreCase("s")){
                validar = true;
            } else if(estadoCivil.equalsIgnoreCase("c")){
                validar = true;
            } else if(estadoCivil.equalsIgnoreCase("d")){
                validar = true;
            } else if(estadoCivil.equalsIgnoreCase("v")){
                validar = true;
            }
            else{
                System.out.println("Opcao digitada incorreta. Digite novamente!");
                validar = false;
            }
        }while(!validar);

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: "+salario);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estado Civil: " +estadoCivil);
    }
}