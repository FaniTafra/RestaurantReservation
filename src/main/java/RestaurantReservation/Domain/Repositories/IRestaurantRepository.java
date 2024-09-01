package RestaurantReservation.Domain.Repositories;

import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
