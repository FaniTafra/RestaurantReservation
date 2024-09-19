package RestaurantReservation.Application.Services;

import RestaurantReservation.Domain.Entities.Restaurant;
import RestaurantReservation.Domain.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRestaurantService {
    List<Restaurant> get();
    void createRestaurant(Restaurant restaurant);
    Restaurant getRestaurant(Integer id);
    void editRestaurant(Restaurant restaurant);
    void deleteRestaurant(Integer id);
}
