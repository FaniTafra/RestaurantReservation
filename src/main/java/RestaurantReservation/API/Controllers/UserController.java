package RestaurantReservation.API.Controllers;

import RestaurantReservation.Application.Services.IUserService;
import RestaurantReservation.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final IUserService service;

    @Autowired
    public UserController(IUserService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<User> get() {
        return this.service.get();
    }

    @PostMapping("/create")
    public void create(@RequestBody User user){
        this.service.createUser(user);
    }

    @PutMapping("/updateUser")
    public void update(@RequestBody User user){
        this.service.editUser(user);
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id){
        return this.service.getUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        this.service.deleteUser(id);
    }
}
