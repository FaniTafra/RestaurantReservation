package RestaurantReservation.Application.Services;

import RestaurantReservation.Domain.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> get();
    void createUser(User user);
    User getUser(Integer id);
    void editUser(User user);
    void deleteUser(Integer id);
}
