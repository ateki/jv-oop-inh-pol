package com.northcoders.shapes;

public class Cube extends Shape3D {
    public Rectangle base;

    private Cube(Rectangle size) {

    }

    public Cube(int size) {
        this(new Rectangle(size, size));
    }



    @Override
    public  double calculateVolume() {
        if (base instanceof Rectangle r) {
            return Math.pow(r.length, 3);
        }
        return 0;
    }
}
