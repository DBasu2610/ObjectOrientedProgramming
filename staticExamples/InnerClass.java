package staticExamples;
public class InnerClass { // outer class cannot be static
    class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        // Test a = new Test(null); // these objects would give an error as they belong
        // to a non static inner class which is again dependent on an outer class
        // Test b = new Test("one");
    }

}