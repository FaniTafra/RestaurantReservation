package RestaurantReservation.Infrastructure.Services;

import RestaurantReservation.Application.Services.IRestaurantService;
import RestaurantReservation.Domain.Entities.Restaurant;
import RestaurantReservation.Domain.Repositories.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements IRestaurantService {
    private final IRestaurantRepository repository;

    @Autowired
    public RestaurantService(IRestaurantRepository repository){
        this.repository = repository;
    }
    @Override
    public List<Restaurant> get() {
        return this.repository.findAll();
    }

    @Override
    public void createRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            throw new IllegalArgumentException("Restaurant name cannot be null");
        }
        this.repository.save(restaurant);
    }
}
