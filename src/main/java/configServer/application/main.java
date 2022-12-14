package configServer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }
}
