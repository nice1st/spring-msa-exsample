package server.msaauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("cyh.example.*")
@EnableJpaRepositories("cyh.example.*")
public class MsaAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaAuthApplication.class, args);
	}

}
