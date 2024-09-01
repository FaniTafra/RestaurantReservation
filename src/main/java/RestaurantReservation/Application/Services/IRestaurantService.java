package RestaurantReservation.Application.Services;

import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRestaurantService {
    List<Restaurant> get();
    void createRestaurant(Restaurant restaurant);
}
