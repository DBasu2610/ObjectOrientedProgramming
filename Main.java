
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // storing data of students in array
        int[] rollno = new int[5];
        String[] names = new String[5];
        float[] mark = new float[5];

        // storing data in your own datatype=> class

        Student debu = new Student();

        System.out.println(debu.name + " " + debu.roll + " " + debu.marks);
        debu.greeting();

        Student pipre = new Student(15, "Pipre Halder", 87.5f);
        System.out.println(pipre.name + " " + pipre.marks + " " + pipre.roll);

        Student random = new Student(pipre);
        System.out.println(random.name + " " + random.marks + " " + random.roll);

        Student one = new Student();
        Student two = one; // here Student one and two refer to the same object and memory, not that a copy
                           // of one is created during the creation of two

        one.name = "random";
        System.out.println(two.name);
    }
}

class Student {
    int roll;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! I am " + name);
    }

    // a constructor is a special kinda function which defines what to do when a
    // class is created
    Student() {
        // this keyword, it changes accordingly with respect to the name of the object
        // created
        this.name = "Debadrita Basu";
        this.marks = 89.5f;
        this.roll = 184;
    }

    Student(int roll, String name, float marks) {
        // binds these arguments with the objects
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

    // constructor using object as parameter

    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

}