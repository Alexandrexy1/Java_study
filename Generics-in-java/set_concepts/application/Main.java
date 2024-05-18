package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> setLinked = new LinkedHashSet<>();
        Set<String> setTree = new TreeSet<>(Arrays.asList("Car", "Laptops", "Ring"));

        setLinked.add("Laptops");
        setLinked.add("Motorcycle");
        setLinked.add("Car");
        setLinked.add("Ring");
        setLinked.add("Food");

        set.addAll(setLinked);

        setTree.retainAll(set);

        set.removeIf(value -> value.length() > 5);
        
        System.out.println(set.contains("Car")); // true

        for (String value: setLinked) {
            System.out.println(value); // Motorcycle Car Ring Laptops Food
        }
        
        System.out.println("#########");
        
        for (String value: set) {
            System.out.println(value); // Car Ring Food
        }
        
        System.out.println("#########");

        for (String value: setTree) {
            System.out.println(value); // Car Laptops Ring
        }
    }
}