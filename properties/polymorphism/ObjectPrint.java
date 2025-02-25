package properties.polymorphism;
public class ObjectPrint extends Object {

    int num;

    
    public ObjectPrint(int num) {
        this.num = num;
    }

    


    @Override
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }




    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj); //this actually prints a hashed value because it calls the toString method from the Object class
        
    }
    
}
