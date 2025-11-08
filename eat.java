
package animal0;

abstract class Animal {

    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat and hunts in the jungle.");
    }

    void sleep() {
        System.out.println("Lion sleeps during the day and hunts at night.");
    }
}


class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats large prey like deer and wild boar.");
    }

    void sleep() {
        System.out.println("Tiger sleeps for around 16 hours a day.");
    }
}


class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass, leaves, and fruits.");
    }

    void sleep() {
        System.out.println("Deer sleeps lightly and stays alert for predators.");
    }
}


public class eat {
    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

     
        System.out.println("Lion ");
        lion.eat();
        lion.sleep();

        System.out.println("\n Tiger ");
        tiger.eat();
        tiger.sleep();

        System.out.println("\n Deer ");
        deer.eat();
        deer.sleep();
    }
}
