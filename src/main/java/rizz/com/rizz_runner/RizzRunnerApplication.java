package rizz.com.rizz_runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RizzRunnerApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RizzRunnerApplication.class, args);

        Message message = (Message) context.getBean("message");
		System.out.println(message.getMessage());
    }


}
