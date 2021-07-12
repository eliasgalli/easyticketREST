package com.example.EasyTicketDemo.models;

import javax.persistence.*;
@Entity
@Table(name="customers")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique =true, nullable = false)
    private Long id;
    private String description;
    

    public Long getId(){
        return this.id;
    }
    public void setId(Long _id){
        this.id = _id;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String _Description){
        this.description = _Description;
    }
}
