package RestaurantReservation.Infrastructure.Services;

import RestaurantReservation.Application.Services.IUserService;
import RestaurantReservation.Domain.Entities.User;
import RestaurantReservation.Domain.Repositories.IUserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    private final IUserRepository repository;

    @Autowired
    public UserService(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> get() {
        return this.repository.findAll();
    }

    @Override
    public void createUser(User user) {
        if (user == null)
            throw new IllegalArgumentException("User cannot be null");

        this.repository.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + id));
    }

    @Override
    public void editUser(User user) {
        if (user == null)
            throw new IllegalArgumentException("User cannot be null");

        this.repository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        if (!this.repository.existsById(id))
            throw new EntityNotFoundException("User with ID " + id + " does not exist.");

        this.repository.deleteById(id);
    }
}
