package sjt.http.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class SjtWebClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(SjtWebClient.class);

    public static void main(String[] args) {

        if (args.length < 1) {
            LOGGER.error("접속할 도메인을 입력해 주세요.");
            return;
        }

        String host;
        String path;
        try {
            URL url = new URL(args[0]);
            host = url.getHost();
            path = url.getPath();
        } catch (MalformedURLException e) {
            LOGGER.error("MalformedURLException is occurred :: ", e);
            return;
        }

        Socket clientSocket = null;

        OutputStream outputStream = null;
        PrintWriter printWriter = null;

        try {

            clientSocket = new Socket(host, 8088);

            outputStream = clientSocket.getOutputStream();
            printWriter = new PrintWriter(outputStream, true);

            printWriter.println("HEAD " + path + " HTTP/1.1");
            printWriter.println("Host: " + host);
            printWriter.println("User-Agent: Simple Http Client");
            printWriter.println("Accept: text/html");
            printWriter.println("Accept-Language: en-US");
            printWriter.println("Connection: close");
            printWriter.println();

            outputStream.close();
            printWriter.close();

            LOGGER.info("send to server!!!!!");

        } catch (UnknownHostException ukhe) {
            LOGGER.error("UnknownHostException is occurred :: ", ukhe);
        } catch (IOException ioe) {
            LOGGER.error("IOException is occurred :: ", ioe);
        }

        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            inputStream = clientSocket.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);

            StringBuilder stringBuilder = new StringBuilder();

            bufferedReader = new BufferedReader(inputStreamReader);
            int character;
            while ((character = inputStreamReader.read()) != -1) {
                stringBuilder.append((char) character);
            }

            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();

            LOGGER.info(stringBuilder.toString());

            //            bufferedReader.lines().forEach(line -> {
            //                if (!(line == null || line.length() == 0)) {
            //                    LOGGER.info(line);
            //                }
            //            });
            LOGGER.info("finished");
        } catch (IOException ioe) {
            LOGGER.error("IOException is occurred :: ", ioe);
        }
    }

}
