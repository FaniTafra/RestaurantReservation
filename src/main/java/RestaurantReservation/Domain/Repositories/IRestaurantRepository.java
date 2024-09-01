package RestaurantReservation.Domain.Repositories;

import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {
    List<Restaurant> Get();
    void CreateRestaurant(Restaurant restaurant);
}
