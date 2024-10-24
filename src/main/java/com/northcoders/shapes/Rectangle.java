package com.northcoders.shapes;

public class Rectangle extends Shape {
    protected float length;
    protected float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.length;
    }
}
