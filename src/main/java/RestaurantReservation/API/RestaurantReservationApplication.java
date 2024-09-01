package RestaurantReservation.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "RestaurantReservation.Domain.Entities")
@EnableJpaRepositories(basePackages = "RestaurantReservation.Domain.Repositories")
@ComponentScan(basePackages = {"RestaurantReservation.Infrastructure.Services", "RestaurantReservation.Application.Services", "RestaurantReservation.Domain.Repositories", "RestaurantReservation.API.Controllers"})
public class RestaurantReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReservationApplication.class, args);
	}

}
