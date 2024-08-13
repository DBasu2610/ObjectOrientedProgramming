package Interfaces.NestedInterface;

public class A {

    public interface Nests {
        boolean isOdd(int num);
    }
    
}

class B implements A.Nests {

    @Override
    public boolean isOdd(int num) {
        
        if(num%2==0) {
            return false;
        }
        return true;
    }
    
}


