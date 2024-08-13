package Generics.Comparing;

public class Student implements Comparable<Student>  {
    int roll;
    float marks;
    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

   
    

    public static void main(String[] args) {
        Student debu = new Student(45, 87.5f);
        Student anti = new Student(12, 99.34f);

        if(debu.compareTo(anti) < 0) {
            System.out.println("Anti has more marks");
        }
        else {
            System.out.println("debu has more marks");
        }
    }
    
}
