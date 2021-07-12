package com.example.EasyTicketDemo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.EasyTicketDemo.models.CustomerModel;
import com.example.EasyTicketDemo.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<CustomerModel> getCustomers(){
        return customerService.getCustomers();
    }
    
    @PostMapping()
    public CustomerModel saveCustomer(@RequestBody CustomerModel customer) {
        return this.customerService.saveCustomer(customer);
    }

    @GetMapping(path = "/{id}")
    public Optional<CustomerModel> getCustomerById(@PathVariable("id") Long id){
        return this.customerService.getById(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.customerService.deleteCustomer(id);
        if (ok){
            return String.format("Customer with id %s was deleted",id);
        } else {
            return String.format("Cannot delete customer with id %s", id);
        }
    }
}
