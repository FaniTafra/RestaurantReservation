package RestaurantReservation.Infrastructure.Services;

import RestaurantReservation.Application.Services.IReservationService;
import RestaurantReservation.Domain.Entities.Reservation;
import RestaurantReservation.Domain.Entities.Restaurant;
import RestaurantReservation.Domain.Repositories.IReservationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {
    public final IReservationRepository repository;

    @Autowired
    public ReservationService (IReservationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Reservation> get() {
        return this.repository.findAll();
    }

    @Override
    public void createReservation(Reservation reservation) {
        if (reservation == null) {
            throw new IllegalArgumentException("Reservation cannot be null");
        }
        this.repository.save(reservation);
    }

    @Override
    public Reservation getReservation(Integer id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + id));
    }

    @Override
    public void deleteReservation(Integer id) {
        if (!this.repository.existsById(id))
            throw new EntityNotFoundException("Reservation with ID " + id + " does not exist.");

        this.repository.deleteById(id);
    }
}
