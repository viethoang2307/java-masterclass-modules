import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class Module12Example {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(3)).build();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://example.com/api"))
            .timeout(Duration.ofSeconds(5))
            .header("Accept", "application/json").GET().build();
        System.out.println(client.version());
        System.out.println(request.uri());
    }
}