package access;

public class A {
    private int  num;   //will not be accessed from any other class
    String name;
    int[] arr;
    A() {
        
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
   
    

    

    

    
    
}
