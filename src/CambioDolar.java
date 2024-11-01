import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CambioDolar {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Câmbio para troca de dólar na cotação atual");
        System.out.println("==============================================================");

        System.out.println();

        Scanner sc = new Scanner(System.in);

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


            //Calculo da Cotação
            double valorDescontoCambio = 0.40;
            double cambio = cotacaoUSD - valorDescontoCambio;

            System.out.println();
            System.out.printf("Cotação do dólar para câmbio: R$ %.2f\n", cambio);

            System.out.println();
            System.out.println("Gostaria de fazer a conversão?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("Convertendo real para dólar:  ");
                System.out.println();
                System.out.println("Digite o valor em reais: ");
                double valor = sc.nextDouble();
                double conversao = valor / cambio;
                System.out.printf("Convertido ficou em: $ %.2f", conversao);
                System.out.println(" dólares.");
                System.out.println();
                System.out.println("Troco: ");
                System.out.println("Digite o valor da nota recebida ou total da soma delas: ");
                double notaRecebida = sc.nextDouble();
                double troco = notaRecebida - conversao;

                System.out.println();
                System.out.printf("Troco é de : $ %.2f", troco);
                System.out.println(" dólares.");
                double reais = troco * cambio;
                System.out.printf("Reais: R$ %.2f", reais);
                System.out.println(" reais.");

            }else {
                System.out.println("Encerrado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
