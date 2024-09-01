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
    @Column(name = "AvailableTables", nullable = false)
    private int availableTables;

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

    public int getAvailableTables() {
        return availableTables;
    }

    public void setAvailableTables(int availableTables) {
        this.availableTables = availableTables;
    }
}
