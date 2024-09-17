package RestaurantReservation.API.Controllers;

import RestaurantReservation.Application.Services.IReservationService;
import RestaurantReservation.Domain.Entities.Reservation;
import RestaurantReservation.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    private final IReservationService service;

    @Autowired
    public ReservationController (IReservationService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Reservation> get() {
        return this.service.get();
    }

    @PostMapping("/create")
    public void create(@RequestBody Reservation reservation){
        this.service.createReservation(reservation);
    }
}
