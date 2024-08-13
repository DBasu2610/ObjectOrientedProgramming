package properties.inheritance;

//multulevel inheritanc


public class BoxPrice extends BoxWeight { // multilevel inheritance where BoxPrice is the child of BoxWeight which is //
                                          // the child of Box

    double price;

    public BoxPrice(double price) {
        super();
        this.price = price;
        
    }

    public BoxPrice() {
        super();
        this.price = 0;
    }

    

    public BoxPrice(double length, double height, double width, double weight, double price) {
        super(length, height, width, weight);// when we are calling the super, it takes the super from BoxWeight which
                                             // in turn calls super from Box

        this.price = price;
    }

}
