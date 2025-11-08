
package flyable;

interface Flyable {
    void fly_obj(); 
}


class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft flies into outer space.");
    }
}


class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane flies through the atmosphere.");
    }
}


class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter hovers and flies at low altitudes.");
    }
}


public class Mainfly {
    public static void main(String[] args) {
        // Create objects
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        
        System.out.println("Spacecraft ");
        spacecraft.fly_obj();

        System.out.println("\n Airplane ");
        airplane.fly_obj();

        System.out.println("\n Helicopter ");
        helicopter.fly_obj();
    }
}
