package RestaurantReservation.Domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name", nullable = false, length = 100)
    private String name;
    @OneToOne
    @JoinColumn(name = "RestaurantAdmin_id")
    private User restaurantAdmin;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getRestaurantAdmin() {
        return restaurantAdmin;
    }

    public void setRestaurantAdmin(User restaurantAdmin) {
        this.restaurantAdmin = restaurantAdmin;
    }
}
