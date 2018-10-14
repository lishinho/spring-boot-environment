package club.throwable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/10/14 21:08
 */
@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${spring.rabbit.host}")
	private String host;

	@Value("${author.name}")
	private String author;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
         log.info("Author:{}", author);
         log.info("Host of current RabbitMQ client:{}", host);
	}
}