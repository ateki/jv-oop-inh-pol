package com.northcoders;


import com.northcoders.shapes.*;
import com.northcoders.vehicles.Car;
import com.northcoders.vehicles.CarEngine;
import com.northcoders.vehicles.Motorcycle;
import com.northcoders.vehicles.MotorcycleEngine;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        testVehicles();
        testShapes();
//        Sphere test = new Sphere(new Circle(4));
//        test.calculateVolume();




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

        List<Shape3D> shapes3d = new ArrayList<>(List.of(new Cube(5)));

        for (Shape shape : shapes) {

            if (shape instanceof Circle circle) {
                shapes3d.add(new Sphere(circle));
                shapes3d.add(new Cylinder(circle, 5));
                shapes3d.add(new Cone(circle, 5));
            }

            else {
                shapes3d.add(new Prism(shape, 5));
                shapes3d.add(new Pyramid(shape, 5));
            }

        }

        for (Shape3D shape3d : shapes3d) {
            System.out.println(shape3d.getClass().getSimpleName() + " with " +
                    shape3d.getBase().getClass().getSimpleName() + " base | Volume = " +
                    shape3d.calculateVolume());
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