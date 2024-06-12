package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import app.model.IPInfoData;
import app.model.OpenUVData;
import app.server.IPInfoClient;
import app.server.OpenUVClient;

public class Main {
    public static void main(String[] args) throws Exception {

        String apiKey = System.getenv("OPENUV_API_KEY");

        try {
            IPInfoClient apiClient = new IPInfoClient();
            IPInfoData ipInfo = apiClient.getIPInfo();
            String city = ipInfo.getCity();
            String country = ipInfo.getCountry();
            double latitude = ipInfo.getLatitude();
            double longitude = ipInfo.getLongitude();

            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String formattedDateTime = currentDateTime.format(formatter);

            OpenUVClient client = new OpenUVClient(apiKey);
            OpenUVData data = client.getOpenUv(latitude, longitude, formattedDateTime);
            System.out.println("The UV Index in your city " + city +", "+ country+ " is " + data.getUvInfo().getUv());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}