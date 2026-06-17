package Curso2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    static void main() throws IOException, InterruptedException{
        Scanner sc = new Scanner(System.in);
        String apiKey = "AIzaSyBmr21moBApfkhHCqrghf3gqO3qvXV1TkI";
        String url = "https://www.googleapis.com/books/v1/volumes?q=";

        System.out.print("Nome do livro: ");
        String livro =  sc.nextLine();

        String api = url + livro + "&key=" + apiKey ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(api)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
