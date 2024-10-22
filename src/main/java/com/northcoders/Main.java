package com.northcoders;


import com.northcoders.shapes.Circle;
import com.northcoders.shapes.Rectangle;
import com.northcoders.shapes.Shape;
import com.northcoders.shapes.Triangle;
import com.northcoders.vehicles.Car;
import com.northcoders.vehicles.CarEngine;
import com.northcoders.vehicles.Motorcycle;
import com.northcoders.vehicles.MotorcycleEngine;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        testVehicles();
        //testShapes();
    }


    public static void testShapes() {

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }
    }

    public static void testVehicles() {

//        System.out.println("\n\nTesting CarEngine \n");
//        System.out.println("========================\n");
//        CarEngine myCarEngine = new CarEngine(true, 900, "Unleaded");
//
//        System.out.println("\n\nTesting MotorcycleEngine \n");
//        System.out.println("========================\n");
//        MotorcycleEngine myMotorcycleEngine = new MotorcycleEngine(false, 888, "Leaded");


        System.out.println("\n\nTesting Car drive and accelerate \n");
        System.out.println("===================================\n");
        Car myCar = new Car("mini", "countryman");
        myCar.drive();


        myCar.accelerate();


        System.out.println("\n\nTesting Motorcycle drive and accelerate \n");
        System.out.println("===================================\n");
        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", "MX 300");
        myMotorcycle.drive();

        // TODO: Refactor accelerate  should only work if engine is on
        myMotorcycle.accelerate();
    }
}