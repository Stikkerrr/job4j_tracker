package ru.job4j.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.job4j.YesNoWTF;

public class MagicBall {

    @SuppressWarnings("checkstyle:MissingSwitchDefault")
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://yesno.wtf/api");
        Scanner in = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder response = new StringBuilder();
        YesNoWTF result;
        while (!"exit".equals(in.next())) {
            in.nextLine();
            String inputLine;
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            try {
                BufferedReader buffer = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                while ((inputLine = buffer.readLine()) != null) {
                    response.append(inputLine);
                }
                result = mapper.readValue(response.toString(), YesNoWTF.class);
                System.out.println(result.getAnswer());
                response.setLength(0);
                buffer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
