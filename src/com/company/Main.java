package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford("myFord", 5);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Tesla tesla = new Tesla("myTesla", 5);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());

        Audi audi = new Audi("myAudi", 5);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car.startEngine()";
    }

    public String accelerate(){
        return "Car.accelerate()";
    }

    public String brake(){
        return "Car.brake()";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford.accelerate()";
    }

    @Override
    public String brake() {
        return "Ford.brake()";
    }
}

class Tesla extends Car{
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Tesla.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Tesla.accelerate()";
    }

    @Override
    public String brake() {
        return "Tesla.brake()";
    }
}

class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }
}