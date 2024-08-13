package properties.polymorphism;

public class Circle extends Shapes {


     //this is known as an annotation
    @Override // method overriding, a kinda run time polymorphism, name,return type same in
              // parent and child class just the body of the method is different
    void area() {
        //this will be given priority when object of class Circle is created
        System.out.println("Area is pie*r*r");
    }

}
