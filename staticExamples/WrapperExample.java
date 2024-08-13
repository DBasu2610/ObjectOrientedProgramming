package staticExamples;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;

        Integer num = 45; //this is an object belonging to Integer class
        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b) {
        int temp = a;
        a=b;
        b=temp;
    }
    

   
    
}

