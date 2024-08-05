package staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population; // these are the properties(variable or method) which are independent of the
                            // object, they are not unique to unique objects

    static void Hello() {
        System.out.println("Hi everybody");
        // System.out.println(this.age); //gives an error since we cannot use "this"
                                        // keyword in a static,"this" is specific to the object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population = Human.population + 1; // use the name of the class instead of this keyword since population
                                                 // is a constant, doesnt change uniquely from object to object
    }

}
