package model.services;

import java.util.ArrayList;
import java.util.List;

public class RandomListService<T> {
    private List<T> randomList = new ArrayList<>();


    public void addValue(T value) {
        randomList.add(value);
    }

    public T first() {
        if (randomList.isEmpty()) throw new IllegalStateException("List is empty");
        return randomList.get(0);
    }

    public void print() {
        if (randomList.isEmpty()) throw new IllegalStateException("List is empty");
        System.out.println(randomList);
    }
}
