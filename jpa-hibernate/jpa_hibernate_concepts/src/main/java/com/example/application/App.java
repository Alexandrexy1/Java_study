package com.example.application;

import com.example.domain.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App {
    public static void main( String[] args ) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        
        EntityManager em = emf.createEntityManager();

        //Person person = em.find(Person.class, 2);
        // System.out.println(person); output: Person [id = 2, name = Maria, email = mariatest@test.com]

        // em.getTransaction().begin();
        // em.remove(person);
        // em.getTransaction().commit();
        // System.out.println(person);

        Person newPerson = em.find(Person.class, 2);
        System.out.println(newPerson); // null
        em.close();
        emf.close();
    }
}

