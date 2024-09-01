package RestaurantReservation.Application.Services;

import RestaurantReservation.Domain.Entities.Restaurant;
import RestaurantReservation.Domain.Repositories.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRestaurantService {
    List<Restaurant> Get();
    void CreateRestaurant(Restaurant restaurant);
}
