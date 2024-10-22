package com.northcoders.shapes;

public class Pyramid extends Shape3D {

    private double height;

    public Pyramid(Shape base, double height) {
    }

    @Override
    public  double calculateVolume() {
        return (base.calculateArea() * this.height) / 3;
    }
}
