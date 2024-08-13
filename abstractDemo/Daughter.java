package abstractDemo;

public class Daughter extends Parent { // in the child class the abstract functions are overriden 

    @Override
    void career() {
        System.out.println("I am a coder");
        
    }

    @Override
    void partner() {
       System.out.println("I love Tony Stark");
    }
    
}
