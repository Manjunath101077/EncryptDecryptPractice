package com.PracticeSpring.SpringBractice.JSON.Contoller;


import com.PracticeSpring.SpringBractice.JSON.Domain.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/json")
public class JsonController {

    ResponseEntity<Customer> getCustomerDetials(@RequestBody Customer customer){
        return ResponseEntity.ok(customer);
    }
}
