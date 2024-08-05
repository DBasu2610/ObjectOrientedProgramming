package staticExamples;
//this is a demo to show initialisation of static variables

public class StaticInitialization {

    static int a = 10;
    static int b;

    static { //static block runs only once when the first object is created
        System.out.println("This is the static block");
        b = a*5;
    }
    public static void main(String[] args) {
        StaticInitialization obj = new StaticInitialization();
        System.out.println(StaticInitialization.a+ " "+ StaticInitialization.b);
    }
    
}
