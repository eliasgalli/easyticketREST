package com.example.EasyTicketDemo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.EasyTicketDemo.models.UserModel;
import com.example.EasyTicketDemo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
        
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
    
    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }
    
    public ArrayList<UserModel> getByPriority(Integer priority){
        return userRepository.findByPriority(priority);
    }
    
    public boolean deleteUser(Long id){
        try{
            userRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
