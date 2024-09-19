package RestaurantReservation.API.Controllers;

import RestaurantReservation.Application.Services.IRestaurantService;
import RestaurantReservation.Domain.Entities.Restaurant;
import RestaurantReservation.Domain.Entities.User;
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

    @GetMapping("/getAll")
    public List<Restaurant> get() {
        return this.service.get();
    }

    @PostMapping("/create")
    public void create(@RequestBody Restaurant restaurant)
    {
        this.service.createRestaurant(restaurant);
    }

    @PutMapping("/update")
    public void update(@RequestBody Restaurant restaurant){
        this.service.editRestaurant(restaurant);
    }

    @GetMapping("/get/{id}")
    public Restaurant get(@PathVariable("id") Integer id){
        return this.service.getRestaurant(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        this.service.deleteRestaurant(id);
    }
}
