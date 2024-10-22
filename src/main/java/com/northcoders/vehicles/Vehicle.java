package com.northcoders.vehicles;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int speed;
    protected Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        this.engine.start();
    }

    public void drive() {
        if (engine.isRunning()) {
            System.out.println("Starting to drive...");
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();


}
