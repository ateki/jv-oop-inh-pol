package com.northcoders.shapes;

public class Cube extends Shape3D {

    private Cube(Rectangle base) {
        this.base = base;
    }

    public Cube(int size) {
        this(new Rectangle(size, size));
        // private constructor
    }

    @Override
    public  double calculateVolume() {
        if (base instanceof Rectangle r) {
            return Math.pow(r.length, 3);
        }
        return 0;
    }
}
