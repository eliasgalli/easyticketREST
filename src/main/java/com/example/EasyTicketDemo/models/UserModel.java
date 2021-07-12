package com.example.EasyTicketDemo.models;

import javax.persistence.*;
@Entity
@Table(name="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique =true, nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Integer priority;


    public Long getId(){
        return this.id;
    }
    public void setId(Long _id){
        this.id = _id;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String _FirstName){
        this.firstName = _FirstName;
    }


    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String _LastName){
        this.lastName = _LastName;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String _email){
        this.email = _email;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String _phone){
        this.phone = _phone;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String _password){
        this.password = _password;
    }

    public Integer getPriority(){
        return priority;
    }
    
    public void setPriority(Integer _priority){
    this.priority = _priority;
}



}
