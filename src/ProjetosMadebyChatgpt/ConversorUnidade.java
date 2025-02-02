package ProjetosMadebyChatgpt;

import java.util.Scanner;

public class ConversorUnidade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean estado = false;

        while(!estado){

            System.out.println("Conversor de unidade");
            System.out.println("Escolha uma opção:");
            System.out.println();
            System.out.println("1 - Temperatura");
            System.out.println("2 - Comprimento");
            System.out.println("3 - Peso");
            System.out.println("4 - Sair");
            System.out.print("Digite sua opção: ");
            int selecao = sc.nextInt();

            System.out.println();

            if(selecao == 1){
                System.out.println("Conversor de temperatura");
                System.out.println("Selecione o formato: ");
                System.out.println("1 - Celsius pra Fahrenheit");
                System.out.println("2 - Fahrenheit para Celsius");

                int tempSelection = sc.nextInt();

                    if(tempSelection == 1){
                        System.out.println("Convertendo Celsius para Fahrenheit");
                        System.out.println("Digite a temperatura em Celsius: ");
                        double celsiusTemp = sc.nextDouble();
                        double farehTempFixedF = celsiusTemp * 1.8 + 32;

                        System.out.println();
                        System.out.println(celsiusTemp + " para °F = " + farehTempFixedF);

                        System.out.println("Temperatura Fahrenheit: " + farehTempFixedF);
                    }
                    else if(tempSelection == 2){
                        System.out.println("Convertendo Fahrenheit para Celsius");
                        System.out.println("Digite a temperatura em Fahrenheit: ");
                        double fahrenheitTemp = sc.nextDouble();
                        double celsiusTempFixedF = (fahrenheitTemp-32)/1.8;

                        System.out.println();
                        System.out.printf(fahrenheitTemp + " para °C = %.2f\n" , celsiusTempFixedF);

                        System.out.printf("Temperatura Fahrenheit: %.2f\n" , celsiusTempFixedF);
                    } else{
                        System.out.println("Você não selecionou nenhuma opção");
                    }
                System.out.println();
            }
            else if (selecao == 2) {
                System.out.println("Conversor de Comprimento");
                System.out.println("Selecione o formato: ");
                System.out.println("1 - Metros para KM");
                System.out.println("2 - Centimetros para M");
                System.out.println("3 - Metros para Centimetros");
                int opcao = sc.nextInt();

                if(opcao == 1){
                    System.out.print("Digite o metro total: ");
                    double metroPKM = sc.nextDouble();
                    double kmResult = metroPKM / 1000;
                    System.out.println(metroPKM + " metros são " +  kmResult + " km");
                }
                else if(opcao == 2){
                    System.out.print("Digite os centimetros: ");
                    double centimetrosPM = sc.nextDouble();
                    double mResult = centimetrosPM / 100;
                    System.out.println(centimetrosPM + " centimetros são " +  mResult + " metros");
                } else if(opcao == 3){
                    System.out.print("Digite os metros: ");
                    double metrosPCM = sc.nextDouble();
                    double cmResult = metrosPCM * 100;
                    System.out.println(metrosPCM + " metros são " +  cmResult + " centimetros");
                }
            }
            else if(selecao == 3){
                System.out.println("Conversor de Peso");
                System.out.println("Selecione o formato: ");
                System.out.println("1 - Kg para g");
                System.out.println("2 - Kg para lb");
                System.out.println("3 - Kg para oz)");
                System.out.println("4 - g para Kg");
                System.out.println("5 - g para lb");
                System.out.println("6 - g para oz");
                System.out.println("7 - oz para g");
                System.out.println("8 - oz para ml");
                int opcao = sc.nextInt();
                    if(opcao == 1){
                        System.out.println("Digite os kg: ");
                        double kg = sc.nextDouble();
                        double gResult = kg * 1000;
                        System.out.println(kg + " kilos são " + gResult + " gramas.");
                    }
                    else if(opcao == 2){
                        System.out.println("Digite os kg: ");
                        double kg = sc.nextDouble();
                        double lbResult = kg * 2.2046;
                        System.out.println(kg + " kilos são " + lbResult + " libras.");
                    }
                    else if(opcao == 3){
                        System.out.println("Digite os kg: ");
                        double kg = sc.nextDouble();
                        double ozResult = kg * 35.274;
                        System.out.println(kg + " kilos são " + ozResult + " oz.");
                    }
                    else if(opcao == 4){
                        System.out.println("Digite as g: ");
                        double g = sc.nextDouble();
                        double kgResult = g / 1000;
                        System.out.println(g + " gramas são " + kgResult + " kilos.");
                    }
                    else if(opcao == 5){
                        System.out.println("Digite as g: ");
                        double g = sc.nextDouble();
                        double lbResult = g / 453.592;
                        System.out.println(g + " gramas são " + lbResult + " libras.");
                    }
                    else if(opcao == 6){
                        System.out.println("Digite as g: ");
                        double g = sc.nextDouble();
                        double ozResult = g / 28.35;
                        System.out.println(g + " gramas são " + ozResult + " oz.");
                    }
                    else if(opcao == 7){
                        System.out.println("Digite os Oz: ");
                        double oz = sc.nextDouble();
                        double gResult = oz * 28.35;
                        System.out.println(oz + " ounces são " + gResult + " gramas.");
                    }
                    else if(opcao == 8) {
                        System.out.println("Digite os Oz: ");
                        double oz = sc.nextDouble();
                        double mlResult = oz * 29.57;
                        System.out.println(oz + " ounces são " + mlResult + " ml.");
                    }else{
                        System.out.println("Você não selecionou uma opção valida");
                    }

            }

            else if(selecao == 4){
                estado = true;
                System.out.println("Obrigado por usar o aplicativo");
            }
            else{
                System.out.println("Você não selecionou uma opção valida");
            }
        }


    }

}
