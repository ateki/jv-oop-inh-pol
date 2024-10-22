package com.northcoders.shapes;

public class Prism extends Shape3D {

    private double height;

    public Prism(Shape base, double height) {
    }

    @Override
    public  double calculateVolume() {
        return base.calculateArea() * this.height;
    }
}
