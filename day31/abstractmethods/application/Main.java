package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapesList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(sc.next());
            sc.nextLine();
            if (shape == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapesList.add(new Rectangle(width, height, color));
            } else {  
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapesList.add(new Circle(radius, color));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape: shapesList) {
                System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}