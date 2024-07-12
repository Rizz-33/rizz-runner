package rizz.com.rizz_runner;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RizzRunnerApplication {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RizzRunnerApplication.class);

	public static void main(String[] args) {
        
		logger.info("Starting RizzRunner");
    }


}
