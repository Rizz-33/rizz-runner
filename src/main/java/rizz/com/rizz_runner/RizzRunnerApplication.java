package rizz.com.rizz_runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RizzRunnerApplication {

    private static final Logger logger = LoggerFactory.getLogger(RizzRunnerApplication.class);

    public static void main(String[] args) {
        logger.info("Starting RizzRunner Successfully");
        
        SpringApplication.run(RizzRunnerApplication.class, args);
        
        logger.info("RizzRunnerApplication has started");
    }
}
