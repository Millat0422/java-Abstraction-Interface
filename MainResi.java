
package resizable;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }


    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }


    public void displaySize() {
        System.out.println("Current Rectangle Size -> Width: " + width + ", Height: " + height);
    }
}


public class MainResi {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);

        System.out.println("Initial Size:");
        rect.displaySize();

        System.out.println("\nResizing Width to 15 and Height to 8:");
        rect.resizeWidth(15);
        rect.resizeHeight(8);

        System.out.println("\nAfter Resizing:");
        rect.displaySize();
    }
}
