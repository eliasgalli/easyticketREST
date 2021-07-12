package com.example.EasyTicketDemo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.EasyTicketDemo.models.CustomerModel;
import com.example.EasyTicketDemo.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository CustomerRepository;
        
    public ArrayList<CustomerModel> getCustomers(){
        return (ArrayList<CustomerModel>) CustomerRepository.findAll();
    }

    public CustomerModel saveCustomer(CustomerModel user){
        return CustomerRepository.save(user);
    }
    
    public Optional<CustomerModel> getById(Long id){
        return CustomerRepository.findById(id);
    }
    
    public boolean deleteCustomer(Long id){
        try{
            CustomerRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
