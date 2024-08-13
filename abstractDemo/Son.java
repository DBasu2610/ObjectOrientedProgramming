package abstractDemo;

public class Son extends Parent { // in the child class the abstract functions are overriden 

    @Override
    void career() {
        System.out.println("I am a doctor");
        
    }

    @Override
    void partner() {
       System.out.println("I love Pepper Potts");
    }
    
}
