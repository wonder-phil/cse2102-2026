import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RecursiveRetryStormClient {
    private static final String SERVER_URL = "http://localhost:5000/do/work";
    private static final int TOTAL_CLIENTS = 2;//15;
    private static final int MAX_RETRIES = 10;

    public static void main(String[] args) {
        System.out.println("Launching " + TOTAL_CLIENTS + " clients to hammer the server...");
        ExecutorService executor = Executors.newFixedThreadPool(TOTAL_CLIENTS);

        for (int i = 1; i <= TOTAL_CLIENTS; i++) {
            final int clientId = i;
            executor.submit(() -> sendRequestWithAggressiveRetries(clientId, 0));
        }

        executor.shutdown();
    }

    private static void sendRequestWithAggressiveRetries(int clientId, int attempt) {
        
        HttpClient client = HttpClient.newBuilder()
                //.connectTimeout(Duration.ofSeconds(2))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SERVER_URL))
                .timeout(Duration.ofMillis(1000))
                .GET()
                .build();


        if (attempt < MAX_RETRIES) {
            attempt++;
            try {
                System.out.println("Client " + clientId + " -> Attempt " + attempt);
                
                HttpResponse<String> response = client.send(
                        request, 
                        HttpResponse.BodyHandlers.ofString()
                );
                
                System.out.println("Client " + clientId + " SUCCESS on attempt " + attempt + 
                                   " (Status: " + response.statusCode() + ")");
                return;
                
            } catch (Exception e) {
                System.out.println("Client " + clientId + " FAILED on attempt " + attempt + 
                                   " (" + e.getClass().getSimpleName() + ")");
                // IMMEDIATE RETRY: No sleep, no backoff, compounding the traffic spike!
                sendRequestWithAggressiveRetries(clientId, attempt);
            }
        } else {
            System.out.println("Client " + clientId + " GAVE UP after " + MAX_RETRIES + " attempts.");
        }
    }
}