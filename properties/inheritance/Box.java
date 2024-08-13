package properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    public Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box( Box obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    public void info() {
        System.out.println("Running the box");
    }
  
}
