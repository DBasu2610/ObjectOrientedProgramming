package Exception;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c= a/b;
        } catch(Exception e) {
            System.out.println(e.getMessage());            //Exception is the class that has the getMessage() method
        }
        
    }
}