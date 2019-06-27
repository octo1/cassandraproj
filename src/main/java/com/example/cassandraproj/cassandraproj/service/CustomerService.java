package com.example.cassandraproj.cassandraproj.service;

import com.example.cassandraproj.cassandraproj.model.Customer;
import com.example.cassandraproj.cassandraproj.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anukool_Mua on 2019-06-25
 */

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public List<Customer> retrieveCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    //
    public List<Customer> retrieveCustomer23(String firstName) {
        return (List<Customer>) customerRepository.findByFirstName(firstName);
    }

    public List<Customer> retrieveCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }



    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
