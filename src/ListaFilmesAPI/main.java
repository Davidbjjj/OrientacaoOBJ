package ListaFilmesAPI;

import ListaFilmesAPI.Models.TituloOMDB;
import Modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual filme você quer ver?");
        String filme=sc.nextLine();
        String endereco="http://www.omdbapi.com/?t="+filme.replace(" ","+")+"&apikey=29334a08";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json =response.body();
        Gson gson= new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOMDB meuTituloOM = gson.fromJson(json, TituloOMDB.class);

        try{
            System.out.println("Titulo achado");
            Titulo meuTitulo = new Titulo(meuTituloOM);
            System.out.println(meuTitulo);
        }catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }
    }

}
