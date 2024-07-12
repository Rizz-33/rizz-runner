package rizz.com.rizz_runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rizz.com.rizz_runner.classes.Message;

@SpringBootApplication
public class RizzRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RizzRunnerApplication.class, args);

		var message = new Message();
		System.out.println(message.getMessage());
	}

}
