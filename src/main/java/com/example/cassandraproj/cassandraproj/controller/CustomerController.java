package com.example.cassandraproj.cassandraproj.controller;

import com.example.cassandraproj.cassandraproj.model.Customer;
import com.example.cassandraproj.cassandraproj.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anukool_Mua on 2019-06-25
 */

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/index")
    public String index() {

        return "index page";

    }

    @GetMapping()
    public ResponseEntity<?> getCustomers() {
        List<Customer> customers = customerService.retrieveCustomer();
        return ResponseEntity.ok(customers);

    }

    @GetMapping("/get23")
    public ResponseEntity<?> getCustomers23() {
        List<Customer> customers = customerService.retrieveCustomer23("ee");
        return ResponseEntity.ok(customers);

    }

    @GetMapping("/{email}")
    public ResponseEntity<?> getCustomerEmail(@PathVariable String email) {
        List<Customer> customers = customerService.retrieveCustomerByEmail(email);
        return ResponseEntity.ok(customers);

    }



    @PostMapping
    public ResponseEntity<?> postCustomers(@RequestBody Customer body) {

        Customer customer = customerService.createCustomer(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);

    }

}
