package ProjetosMadebyChatgpt;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema conversor de moeda");
        Scanner sc = new Scanner(System.in);
        boolean opcao = false;

        while (!opcao) {
            System.out.println("Selecione a moeda:");
            System.out.println("1 - Dólar");
            System.out.println("2 - Euro");
            System.out.println("3 - Libra");
            System.out.println("4 - Yene Japonês");
            System.out.println("5 - Sair");

            System.out.print("Digite sua opcao: ");
            int selecao = sc.nextInt();

            if (selecao == 1) {
                try {
                    // URL da API da AwesomeAPI para pegar a cotação do dólar
                    String url = "https://economia.awesomeapi.com.br/json/last/USD-BRL";

                    // Conexão HTTP
                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");

                    // Ler a resposta da API
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Converter resposta para String
                    String responseString = response.toString();

                    // Parsear a resposta JSON
                    JsonObject jsonObject = JsonParser.parseString(responseString).getAsJsonObject();
                    JsonObject usdBrl = jsonObject.getAsJsonObject("USDBRL");

                    // Extrair a cotação atual do dólar
                    double cotacaoUSD = usdBrl.get("bid").getAsDouble();

                    // Exibir a cotação do dólar
                    System.out.printf("Cotação do dólar comercial: R$ %.2f", cotacaoUSD);
                    System.out.println();
                    System.out.println();

                    System.out.println("Digite o valor em dólares: ");
                    double dolarVALOR = sc.nextDouble();
                    double cambioREAL = dolarVALOR * cotacaoUSD;

                    System.out.printf("Valor convertido: R$ %.2f" ,cambioREAL);
                    System.out.println();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
            if (selecao == 2) {
                try {
                    // URL da API da AwesomeAPI para pegar a cotação do euro
                    String url = "https://economia.awesomeapi.com.br/json/last/EUR-BRL";

                    // Conexão HTTP
                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");

                    // Ler a resposta da API
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Converter resposta para String
                    String responseString = response.toString();

                    // Parsear a resposta JSON
                    JsonObject jsonObject = JsonParser.parseString(responseString).getAsJsonObject();
                    JsonObject eurBrl = jsonObject.getAsJsonObject("EURBRL");

                    // Extrair a cotação atual do dólar
                    double cotacaoEUR = eurBrl.get("bid").getAsDouble();

                    // Exibir a cotação do dólar
                    System.out.printf("Cotação do euro comercial: R$ %.2f", cotacaoEUR);
                    System.out.println();
                    System.out.println();

                    System.out.println("Digite o valor em euros: ");
                    double euroVALOR = sc.nextDouble();
                    double cambioREAL = euroVALOR * cotacaoEUR;

                    System.out.printf("Valor convertido: R$ %.2f" ,cambioREAL);
                    System.out.println();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (selecao == 3) {
                try {
                    // URL da API da AwesomeAPI para pegar a cotação da libra esterlina
                    String url = "https://economia.awesomeapi.com.br/json/last/GBP-BRL";

                    // Conexão HTTP
                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");

                    // Ler a resposta da API
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Converter resposta para String
                    String responseString = response.toString();

                    // Parsear a resposta JSON
                    JsonObject jsonObject = JsonParser.parseString(responseString).getAsJsonObject();
                    JsonObject gbpBrl = jsonObject.getAsJsonObject("GBPBRL");

                    // Extrair a cotação atual do dólar
                    double cotacaoGBP = gbpBrl.get("bid").getAsDouble();

                    // Exibir a cotação do dólar
                    System.out.printf("Cotação do libra esterlina comercial: R$ %.2f", cotacaoGBP);
                    System.out.println();
                    System.out.println();

                    System.out.println("Digite o valor em libra esterlina: ");
                    double libraVALOR = sc.nextDouble();
                    double cambioREAL = libraVALOR * cotacaoGBP;

                    System.out.printf("Valor convertido: R$ %.2f" ,cambioREAL);
                    System.out.println();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (selecao == 4) {
                try {
                    // URL da API da AwesomeAPI para pegar a cotação do yene
                    String url = "https://economia.awesomeapi.com.br/json/last/JPY-BRL";

                    // Conexão HTTP
                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");

                    // Ler a resposta da API
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Converter resposta para String
                    String responseString = response.toString();

                    // Parsear a resposta JSON
                    JsonObject jsonObject = JsonParser.parseString(responseString).getAsJsonObject();
                    JsonObject jpyBrl = jsonObject.getAsJsonObject("JPYBRL");

                    // Extrair a cotação atual do dólar
                    double cotacaoJPY = jpyBrl.get("bid").getAsDouble();

                    // Exibir a cotação do dólar
                    System.out.printf("Cotação do yene comercial: R$ %.2f", cotacaoJPY);
                    System.out.println();
                    System.out.println();

                    System.out.println("Digite o valor em yene japonês: ");
                    double yeneVALOR = sc.nextDouble();
                    double cambioREAL = yeneVALOR * cotacaoJPY;

                    System.out.printf("Valor convertido: R$ %.2f" ,cambioREAL);
                    System.out.println();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(selecao == 5){
                opcao = true;
            }
        }
        }
    }