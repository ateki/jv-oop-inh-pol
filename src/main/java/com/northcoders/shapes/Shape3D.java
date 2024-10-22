package com.northcoders.shapes;

public abstract class Shape3D {
    protected Shape base;

    public abstract double calculateVolume();

    public Shape getBase() {
        return base;
    }
}
