package com.example.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public Person() {}

    public Person(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer value) {
        id = value;
    }

    public void setName(String value) {
        name = value;
    }

    public void setEmail(String value) {
        email = value;
    }

    public String toString() {
        return "Person [" + "id = " + id + ", name = " + name + ", email = " + email + "]"; 
    }
}
