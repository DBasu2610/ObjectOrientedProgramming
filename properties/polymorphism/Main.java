package properties.polymorphism;

//we deal with polymorphism here. Shapes is the parent class which is being inhrited by Circle,Square,Triangle

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area(); // the function area in different objects is being represented the way its
                       // present in its class
    }

}
