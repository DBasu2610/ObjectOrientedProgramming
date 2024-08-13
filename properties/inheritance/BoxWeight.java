package properties.inheritance;

public class BoxWeight extends Box { // extends keyword which passes on the propoerties of Box to BoxWeight hence Box
                                     // is the parent class and BoxWeight is the child class

    double weight;

    public BoxWeight(double length, double height, double width, double weight) { //Here comes the super keyword

        super(length, height, width);//says to call the parent class constructor
        //used to initialize values of the parent class
        this.weight = weight;
    }

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double weight) {
        this.weight = weight;
    }

}
