package omar.mebarki.elfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.com.trustsystems.elfinder.support.spring", "omar.mebarki.elfinder.config"})
public class ElfinderJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElfinderJavaApplication.class, args);
    }

}
