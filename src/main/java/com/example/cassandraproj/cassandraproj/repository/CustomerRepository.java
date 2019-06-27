package com.example.cassandraproj.cassandraproj.repository;

import com.example.cassandraproj.cassandraproj.model.Customer;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Anukool_Mua on 2019-06-25
 */

@Repository
public interface CustomerRepository extends CassandraRepository<Customer, UUID> {

    @AllowFiltering //not recommend annotation tho
    List<Customer> findByFirstName(String firstName);

    @AllowFiltering //not recommend annotation tho
    List<Customer> findByEmail(String email);


}
