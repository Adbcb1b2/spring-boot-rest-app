package com.simple.web;

import com.simple.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define as a spring MVC controller
public class HelloController {

    // Method responding to HTTP GET requests for the path /hello
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    // Responds to GET requests for /cusomter
    // Creates a customer with hard-coded values, spring MVC returns and converts the JSON into JSON automatically
    // http://localhost:8080/customer
    @GetMapping("/customer")
    public Customer getCustomer(){
        var customer = new Customer();
        customer.setId(1);
        customer.setName("Kim");
        customer.setEmail("mail@mail.com");
        return customer;
    }
}
