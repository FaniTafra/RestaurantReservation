package RestaurantReservation.Domain.Entities;

import RestaurantReservation.Domain.Enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;
    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;
    @Column(name = "Email", nullable = false, length = 100)
    private String email;
    @Column(name = "Password", length = 200)
    private String password;
    @Column(name = "PhoneNumber", nullable = false, length = 15)
    private String phoneNumber;
    @Column(name = "Role")
    private UserRole userRole;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
