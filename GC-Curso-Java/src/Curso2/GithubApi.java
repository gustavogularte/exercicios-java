package Curso2;

import com.sun.net.httpserver.HttpHandlers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GithubApi {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o user: ");
        String user = input.nextLine();
        String url = "https://api.github.com/users/" + user;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
                    .header("Accept", "application/vnd.github.v3+json").build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado");
            }

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
