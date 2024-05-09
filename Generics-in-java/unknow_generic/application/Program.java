package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program { 
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 4, 9, 10, 15, 20);
        List<Double> doubleList = Arrays.asList(1.3, 10.50, 32.10, 54.98);
        List<Object> copyList = new ArrayList<>();

        addInNewList(doubleList, copyList);
        addInNewList(integerList, copyList);

        printCopyList(copyList);
    
    }

    public static void addInNewList(List<? extends Number> listOne, List<? super Number> copyList) {
        for (Number value: listOne) {
            copyList.add(value);
        }
    }

    public static void printCopyList(List<?> list) {
        for (Object value: list) {
            System.out.print(value + " ");
        }
    }
}