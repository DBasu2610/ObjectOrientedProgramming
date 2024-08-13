package Interfaces.extendedInterfaces;

public interface A {
    void fun();

    //static interface methods have to have a body
    //call via the interface name
    static void greeting() {
        System.out.println("I am a static method");
    }
}
