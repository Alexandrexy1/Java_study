package entities;

import entities.enums.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    
    public abstract Double area();
}
