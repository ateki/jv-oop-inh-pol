package com.northcoders.shapes;

public class Sphere extends Shape3D {

    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public  double calculateVolume() {
        if (base instanceof Circle c) {
            return Math.PI * c.radius * ( (double) 4/3);
        }
        else
            return 0;
    }
}
