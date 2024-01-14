/*
/   Powered by SunriseSunset.io
 */
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!");
        GUI io = new GUI("Today is January 15, 2022");
        io.basicGUI();


        String urlLink="https://api.sunrisesunset.io/json?lat=30.5595&lng=22.9375/json?lat=30.5595&lng=22.9375";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =  HttpRequest.newBuilder().GET().uri(URI.create(urlLink)).build();

        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
//    https://api.sunrisesunset.io/json?lat=30.5595&lng=22.9375/json?lat=30.5595&lng=22.9375


}