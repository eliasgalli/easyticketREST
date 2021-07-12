package com.example.EasyTicketDemo.repositories;

import com.example.EasyTicketDemo.models.CustomerModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel, Long>{
    
}
