package Interfaces.extendedInterfaces;

public class Main implements B {
    //we have to override fun() here as B extends A

    @Override
    public void fun() {
        
    }

    @Override
    public void greet() {
        
    }
    
    public static void main(String[] args) {
        // Main main = new Main();
        A.greeting();
    }
}
