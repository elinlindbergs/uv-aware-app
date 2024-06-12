package app.server;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.model.OpenUVData;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import org.apache.http.HttpResponse;

public class OpenUVClient {
    private HttpClient httpClient;
    private ObjectMapper objectMapper;
    private static final String API_URL = "https://api.openuv.io/api/v1/uv";
    private String apiKey;

    public OpenUVClient(String apiKey) {
        this.httpClient = HttpClients.createDefault();
        this.objectMapper = new ObjectMapper();
        this.apiKey = apiKey;
    }

        public OpenUVData getOpenUv(double latitude, double longitude, String dateTime) throws IOException{
        
        // Construct the API URL with query parameters
        String apiUrl = API_URL 
            + "?lat=" + latitude 
            + "&lng=" + longitude 
            + "&dt=" + dateTime;
        
        // Create an HTTP GET request with the API URL
        HttpGet request = new HttpGet(apiUrl);
        
        // Add the API key to the request header for authentication
        request.addHeader("x-access-token", apiKey);

        // Send the request and get the response
        System.out.println("Sending request to OpenUV API...");
        HttpResponse response = httpClient.execute(request);

        // Extract the response body as a string
        String responseBody = EntityUtils.toString(response.getEntity());

        // Deserialize JSON response into an instance of the IPinfo class
        OpenUVData data = objectMapper.readValue(responseBody, OpenUVData.class);

        return data;

    }

}
