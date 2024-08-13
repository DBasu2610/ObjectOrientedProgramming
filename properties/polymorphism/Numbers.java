package properties.polymorphism;

public class Numbers {

    //method overloading

    int sum(int a, int b) {
        return a+b;
    }

    int sum(int a, int b,int c) {
        return a+c+b;
    }

    void sum() {
        System.out.println("sum of numbers ");
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers() ;
        n1.sum();
        System.out.println(n1.sum(2,3));
        System.out.println(n1.sum(2,3,4));
    }
        
    

    
} 