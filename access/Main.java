package access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(5, "Debu");

        System.out.println(obj.getNum());// we still cannot access num variable as it is private, however the getter
                                         // method returns num, we can call getter method as it will always be public

        
        // ArrayList<Integer> list = new ArrayList<>();
        // list.DEFAULT_CAPACITY; // this does give an error because in the ArrayList
        // class default_capacity is a private variable
    }

}
