package RestaurantReservation.API.Controllers;

import RestaurantReservation.Application.Services.IRestaurantService;
import RestaurantReservation.Domain.Entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {
    private final IRestaurantService service;

    @Autowired
    public RestaurantController(IRestaurantService service)
    {
        this.service = service;
    }

    @GetMapping("/get")
    public List<Restaurant> get() {
        return this.service.get();
    }

    @PostMapping("/create")
    public void create(@RequestBody Restaurant restaurant)
    {
        this.service.createRestaurant(restaurant);
    }
}
