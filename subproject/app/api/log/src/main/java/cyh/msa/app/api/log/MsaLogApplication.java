package cyh.msa.app.api.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.ControllerAdvice;

@EnableDiscoveryClient
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "cyh.msa.app.api.log")
@EntityScan("cyh.msa.domain")
@EnableJpaRepositories("cyh.msa.domain")
public class MsaLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaLogApplication.class, args);
	}

}
