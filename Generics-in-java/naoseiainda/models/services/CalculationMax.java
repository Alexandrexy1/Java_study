package models.services;

import java.util.List;


public final class CalculationMax {
    public static <T extends Comparable<T>> T max(List<T> list) {
        T max = list.get(0);

        if (!list.isEmpty()) {
            for (T item: list) {
                if (item.compareTo(max) > 0) max = item;
            }
            return max;
        }
        else throw new IllegalStateException("List is empty");
    }
}
