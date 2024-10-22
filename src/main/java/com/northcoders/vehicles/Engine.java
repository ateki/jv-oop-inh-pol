package com.northcoders.vehicles;

public class Engine {
    private boolean isRunning;
    protected int horsePower;
    protected String fuelType;


    public Engine(boolean isRunning, int horsePower, String fuelType) {
        this.isRunning = isRunning;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public void start() {
        this.isRunning = true;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
