package ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human debu = new Human(20, "debu");
        // Human pipre = new Human(debu); 

        Human twin = (Human)debu.clone();
        System.out.println(twin.age + twin.name);


    }
}
