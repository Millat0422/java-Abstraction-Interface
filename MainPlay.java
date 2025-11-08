
package play;


interface Playable {
    void play(); 
}


class Football implements Playable {
    public void play() {
        System.out.println("Playing Football: Kicking the ball into the goal.");
    }
}


class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball: Hitting the ball over the net.");
    }
}


class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball: Dribbling and shooting into the hoop.");
    }
}


public class MainPlay {
    public static void main(String[] args) {
     
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        
        System.out.println(" Football ");
        football.play();

        System.out.println("\n Volleyball ");
        volleyball.play();

        System.out.println("\n Basketball ");
        basketball.play();
    }
}
