package com.example;


import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Entity {
    @Id
    private int id;
    private String name;
    private String email;

}
