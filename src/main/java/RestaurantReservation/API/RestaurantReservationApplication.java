package RestaurantReservation.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "RestaurantReservation.Domain.Entities")
public class RestaurantReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReservationApplication.class, args);
	}

}
