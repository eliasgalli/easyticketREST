package com.example.EasyTicketDemo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.EasyTicketDemo.models.UserModel;
import com.example.EasyTicketDemo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }
    
    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }
    @GetMapping("/query")
    public ArrayList<UserModel> getUserByPriority(@RequestParam("priority") Integer Priority){
        return this.userService.getByPriority(Priority);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if (ok){
            return String.format("User with id %s was deleted",id);

        } else {
            return String.format("Cannot delete user with id %s", id);
        }
    }
}
