package pe.com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioZuulServerApplication.class, args);
	}

}
