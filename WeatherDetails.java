import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherDetails {
    public static void main(String[] args) {
        try {
            String apiKey = "139883e5c992ed3ceb2692fca47a9b77"; // Replace with your API key
            String city = "Hyderabad"; // Replace with your city name
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 401) {
                System.out.println("Failed to fetch weather details. Unauthorized access. Please check your API key.");
            } else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONObject main = jsonResponse.getJSONObject("main");
                double temperature = main.getDouble("temp");
                double humidity = main.getDouble("humidity");

                System.out.println("Weather Details for " + city);
                System.out.println("Temperature: " + temperature + " K"); // Temperature in Kelvin
                System.out.println("Humidity: " + humidity + "%");
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
