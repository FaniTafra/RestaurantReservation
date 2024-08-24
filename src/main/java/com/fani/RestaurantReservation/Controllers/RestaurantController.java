package com.fani.RestaurantReservation.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Base path for all API endpoints in this controller
public class RestaurantController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
