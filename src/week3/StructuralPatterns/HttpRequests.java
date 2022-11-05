package week3.StructuralPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static javafx.css.StyleOrigin.USER_AGENT;

public class HttpRequests {

    private static final String GET_URL = "https://reqres.in/api/users?page";
    private static final String POST_URL = "https://reqres.in/api/users";
    private static final String PATCH_URL = "https://reqres.in/api/users/2";

    private static final String POST_PARAMS = "{name: morpheus,job:leader}";

    void get() throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", String.valueOf(USER_AGENT));
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

    }
    static void sendPOST() throws IOException {
        URL obj = new URL(POST_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", String.valueOf(USER_AGENT));
        con.setDoOutput(true);

        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), "utf-8"));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine.trim());
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    }
    static void patch() throws IOException {
        URL obj = new URL(PATCH_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
        con.setRequestProperty("User-Agent", String.valueOf(USER_AGENT));
        con.setDoOutput(true);

        int responseCode = con.getResponseCode();
        System.out.println("PATCH Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), "utf-8"));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine.trim());
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("PATCH request not worked");
        }
    }
    static void delete() throws IOException {
        URL obj = new URL(PATCH_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("DELETE");
        con.setRequestProperty("User-Agent", String.valueOf(USER_AGENT));
        con.setDoOutput(true);

        int responseCode = con.getResponseCode();
        System.out.println("PATCH Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_NO_CONTENT) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), "utf-8"));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine.trim());
            }
            in.close();
            System.out.println(response.toString());
        } else {
            System.out.println("PATCH request not worked");
        }
    }

}
