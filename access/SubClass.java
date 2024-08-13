package access;

//we are checking the access of protected things in a subclass,,, so, seems it is possible

public class SubClass  extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(34, "debu");

        System.out.println(obj instanceof SubClass);

        System.out.println(obj.getClass());
    }
    
}
