package RestaurantReservation.Domain.Repositories;

import RestaurantReservation.Domain.Entities.Reservation;
import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer> {
}
