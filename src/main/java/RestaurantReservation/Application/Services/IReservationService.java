package RestaurantReservation.Application.Services;

import RestaurantReservation.Domain.Entities.Reservation;
import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IReservationService {
    List<Reservation> get();
    void createReservation(Reservation reservation);
    Reservation getReservation(Integer id);
    void deleteReservation(Integer id);
}
