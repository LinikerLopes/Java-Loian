package GuimmyProject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class ClasseTesteAPI {




    String dados(String input) {

        Scanner scanner = new Scanner(System.in);
        try {
            // Busca informações do livro
            String bookInfo = fetchBookInfo(input);
            if (bookInfo != null) {
                System.out.println("Informações encontradas:");
                System.out.println(bookInfo);
            } else {
                System.out.println("Nenhuma informação encontrada para o livro: " + input);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao buscar informações: " + e.getMessage());
        }
        return input;
    }

    private static String fetchBookInfo(String query) throws Exception {
        // Cria a URL para a API do Google Books
        String apiUrl = "https://www.googleapis.com/books/v1/volumes?q=" + query.replace(" ", "+");
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Lê a resposta da API
        if (connection.getResponseCode() == 200) {
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();
            reader.close();

            // Processa a resposta JSON
            JsonArray items = jsonResponse.getAsJsonArray("items");
            if (items != null && items.size() > 0) {
                JsonObject book = items.get(0).getAsJsonObject();
                JsonObject volumeInfo = book.getAsJsonObject("volumeInfo");

                String title = volumeInfo.get("title").getAsString();
                String authors = volumeInfo.has("authors") ? volumeInfo.getAsJsonArray("authors").toString() : "Autor desconhecido";
                String description = volumeInfo.has("description") ? volumeInfo.get("description").getAsString() : "Descrição não disponível";

                // Retorna informações formatadas
                return "Título: " + title + "\n" +
                        "Autores: " + authors + "\n" +
                        "Descrição: " + description;
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("Erro ao conectar com a API. Código de resposta: " + connection.getResponseCode());
        }

    }
}