package csqure.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author csqure
 */
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommunityApplication.class, args);
        System.out.println("http://localhost:8887");
    }

}
