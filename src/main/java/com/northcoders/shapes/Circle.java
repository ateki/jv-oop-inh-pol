package com.northcoders.shapes;

public class Circle extends Shape {
    public float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

}
