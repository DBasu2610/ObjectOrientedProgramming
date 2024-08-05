package staticExamples;

public class Main {
    public static void main(String[] args) {
        Human debu = new Human(20, "Debadrita Basu", 20000, false);
        System.out.println(Human.population);//static variable being used independent of the object name

        greet();
    }

    // we are not able to access a non static method in a static method, non static
    // methods belong to particular objects. That's why greet() is made a ststic method
    static void greet() {
        System.out.println("Hello World!");
        //however we can reference a non static within a static by referencing it to an instance
        Main obj = new Main();
        obj.hello();
    }

    //however something static can work very well in a non static
    void hello() {
        System.out.println("Hey there");;
    }

}
