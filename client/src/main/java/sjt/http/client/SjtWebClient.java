package sjt.http.client;

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class SjtWebClient {

    public static void main(String[] args) throws IOException {
        useOkHttpClient();
    }

    private static void useOkHttpClient() throws IOException {
        OkHttpClient client = new OkHttpClient();

        // Request 시작 ======
        HttpURLConnection connection = client.open(new URL("http://localhost:8080/testabc"));
        connection.setRequestProperty("Content-type", "text/plain");
        connection.setRequestMethod("POST");
        OutputStream outputStream = connection.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
        writer.write("outputstream hahahaha");
        writer.flush();
        // Request 끝 =======

        // Response 시작 ======



        String contentType = connection.getContentType();
        System.out.println(contentType);
        System.out.println(connection.getResponseCode());
        System.out.println(connection.getResponseMessage());
        System.out.println(connection.getHeaderFields().toString());



        InputStream inputStream = connection.getInputStream();
        byte[] buffer = new byte[inputStream.available()];
        StringBuilder sb = new StringBuilder();
        int result;
        while ((result = inputStream.read(buffer)) != -1) {

            if (result != 0) {
                sb.append(new String(buffer));
            }
        }
        System.out.println(sb.toString());
        // Response 끝 ======
    }

}
