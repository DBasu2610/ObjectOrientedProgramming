package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.partner();

        Daughter daughter = new Daughter();
        daughter.career();

        Parent.hello(); // we can create static methods in abstract classes but an abstract class cannot
                        // be static because statics cannot be overrriden and the idea behind abstract
                        // classes is to be overriden

        // you cannot create objects of an abstract class
    }

}
