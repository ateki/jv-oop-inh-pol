package com.northcoders.shapes;

public class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }
}
