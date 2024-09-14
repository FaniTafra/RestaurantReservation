package RestaurantReservation.Domain.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    @Column(name = "CreationDate", nullable = false)
    private LocalDateTime creationDate;
    @Column(name = "ReservationDate", nullable = false)
    private LocalDateTime reservationDate;
    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "Restaurant_id")
    private Restaurant restaurant;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public RestaurantReservation.Domain.Entities.User getUser() {
        return user;
    }

    public void setUser(RestaurantReservation.Domain.Entities.User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
