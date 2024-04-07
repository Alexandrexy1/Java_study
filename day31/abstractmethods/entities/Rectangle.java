package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return this.width * this.height;
    }
}
