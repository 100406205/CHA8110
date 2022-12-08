package tidw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringMonogoDBChatApplication {

	public static void main(String[] args) {
		// https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#preface
		SpringApplication.run(SpringMonogoDBChatApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate (RestTemplateBuilder builder) {
		return builder.build();
	}
}
