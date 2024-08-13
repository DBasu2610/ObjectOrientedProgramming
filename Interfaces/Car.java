package Interfaces;

public class Car implements Engine, Brakes {

    @Override
    public void brake() {
        System.out.println("I brake");
    }

    @Override
    public void start() {
        System.out.println("I start");
    }

    @Override
    public void stop() {
        System.out.println("I stop");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate");
    }
    
}
