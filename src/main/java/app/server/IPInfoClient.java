package app.server;

import app.model.IPInfoData;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpResponse;

public class IPInfoClient {
    private HttpClient httpClient;
    private ObjectMapper objectMapper;

    public IPInfoClient() {
        this.httpClient = HttpClients.createDefault();
        this.objectMapper = new ObjectMapper();
    }

    public IPInfoData getIPInfo() throws Exception {
        // Define the URL of the API
        String apiUrl = "https://ipinfo.io/json";

        // Create an HTTP GET request
        HttpGet request = new HttpGet(apiUrl);

        // Send the request and get the response
        System.out.println("Sending request to IPinfo API...");
        HttpResponse response = httpClient.execute(request);

        // Extract the response body as a string
        String responseBody = EntityUtils.toString(response.getEntity());

        // Deserialize JSON response into an instance of the IPinfo class
        IPInfoData ipInfo = objectMapper.readValue(responseBody, IPInfoData.class);

        return ipInfo;
    }

}
