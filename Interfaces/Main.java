package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();;
        car.brake();;
        car.start();
        car.stop();
        System.out.println(car.hashCode());

        MyCar mycar = new MyCar();
        mycar.start();
        mycar.startMedia();
    }
}
