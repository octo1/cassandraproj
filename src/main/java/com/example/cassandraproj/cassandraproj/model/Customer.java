package com.example.cassandraproj.cassandraproj.model;

import com.datastax.driver.core.utils.UUIDs;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

/**
 * Created by Anukool_Mua on 2019-06-25
 */

@Data
@Table
public class Customer {

    @PrimaryKey
    private UUID id;

    public Customer() {
        this.id = UUIDs.timeBased();
    }

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

}
