package Aula13Exec;

import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Exec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha no mês? ");
        double salarioMensal = sc.nextDouble();
        System.out.println("Quantas horas você trabalha por dia? ");
        int horasTrabalhadas = sc.nextInt();

        double horasMensal = horasTrabalhadas * 30;
        double salarioHora = (salarioMensal / 30) /60;

        System.out.println("======================================");
        System.out.println("Você trabalha " + horasTrabalhadas + " todo mês");
        System.out.println("com um salário de " + salarioMensal + " por mês");
        System.out.println("Isso fica em torno de " + horasMensal + " horas por mês");
        System.out.printf("e um salário de %.2f ", salarioHora);
        if(salarioHora < 1) {
            System.out.println("centavos por hora.");
        } else{
            System.out.println("reais por hora");
        }
//====================================================== FIM DO CODIGO CRIADO POR MIM ======================================

        // INICIO DO CODIGO CHATGPT ========================================================================================

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
            System.out.printf("Cotação do dólar: R$ " + cotacaoUSD);
            System.out.println();
            double salarioConvertidoDolar =  salarioMensal / cotacaoUSD;
            System.out.printf("Convertidos, você recebe por mês um total de " + salarioConvertidoDolar);
            System.out.println(" dólares");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
