package pe.com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConversionMonedaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionMonedaApplication.class, args);
	}

}
