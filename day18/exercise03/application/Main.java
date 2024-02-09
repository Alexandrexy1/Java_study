package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add("Alex");
        listName.add("Joãozinho123");
        listName.add(1, "Car");
        listName.removeIf(name -> name.charAt(0) == 'J');
        System.out.println(listName);

        List<String> filterArray = listName.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(filterArray);

        String name = listName.stream().filter(item -> item.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}