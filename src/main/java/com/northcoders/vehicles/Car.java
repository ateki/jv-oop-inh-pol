package com.northcoders.vehicles;

public class Car extends Vehicle {

    // TODO: Makes sense to pass isRunning horsePower fuelType into constructor
    //       or pass CarEngine but for now doing what exercise asking to be done.
    public Car(String make, String model) {
        super(make, model);
        this.engine = new CarEngine(true, 600, "Leaded" );
    }

    @Override
    public void accelerate() {

        System.out.println("Starting to accelerate...");
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.5D;
            case "Leaded" -> 1.2D;
            case "Diesel" -> 1.8D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", (engine.horsePower * fuelMod) * Math.exp(Math.sqrt(i)) / 2));
        }

    }
}
