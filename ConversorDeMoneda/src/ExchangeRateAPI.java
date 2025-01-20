import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ExchangeRateAPI {

    private final String API_KEY = "f45305a924dfc26cb1f04894";
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    //Metodo para obtener la tasa de cambio
    public double obtenerTasaCambio(String monedaOrigen, String monedaDestino) throws IDException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String url = BASE_URL + API_KEY + "/latest/" + monedaOrigen;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();
        //Pasear la respuesta JSON usando Gson

    }
}
