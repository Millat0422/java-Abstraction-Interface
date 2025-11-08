
package vehicle;

abstract class Vehicle {

    abstract void startEngine();
    abstract void stopEngine();
}


class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starts with a key or push button.");
    }

    void stopEngine() {
        System.out.println("Car engine stops when the key is turned off .");
    }
}


class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine starts with a self-start button or a kick.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stops when the ignition is turned off.");
    }
}


public class engine {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        System.out.println(" Car ");
        car.startEngine();
        car.stopEngine();

        System.out.println();

       
        Vehicle bike = new Motorcycle();
        System.out.println(" Motorcycle ");
        bike.startEngine();
        bike.stopEngine();
    }
}
