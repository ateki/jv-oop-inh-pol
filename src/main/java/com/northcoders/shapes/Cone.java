package com.northcoders.shapes;

public class Cone extends Shape3D {

    private double height;

    public Cone(Circle base, double height) {
        this.height = height;
    }

    @Override
    public  double calculateVolume() {
        return (base.calculateArea() * this.height) / 3;
    }
}
