package application;

import entities.People;

public class Program {
    public static void main(String[] args) {
        People person = new People("Maria", 30);
        People person2 = new People("Maria", 30);
        People person3 = new People("Alex", 20);


        System.out.println(person.hashCode()); // Same number
        System.out.println(person2.hashCode()); // Same number
        System.out.println(person.equals(person2)); // True
        System.out.println(person3.hashCode()); // Different number
        System.out.println(person.equals(person3)); // False
    }

}
