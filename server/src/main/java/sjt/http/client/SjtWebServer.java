package sjt.http.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
@RestController
public class SjtWebServer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SjtWebServer.class, args);
    }

    @GetMapping("/{message}")
    public String getTest(HttpServletRequest request, @PathVariable String message) {
        return message.toUpperCase();
    }

    @PostMapping(value = "/{message}", consumes = {"text/plain", "application/*"}, produces = {"text/plain", "application/*"})
    public String postTest(HttpServletRequest request, HttpServletResponse response, @PathVariable String message,
            @RequestBody String text) {
        System.out.println(text);
        return message.toUpperCase();
    }
}
