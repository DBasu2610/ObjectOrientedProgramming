package Generics;

import java.util.Arrays;

public class WildCards<T extends Number> {     //because Integer , Float all extend the Number class

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "ArrayLists [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        ArrayLists list = new ArrayLists();
        // list.add(3);
        // list.add(5);
        // list.add(9);

        for (int i = 0; i < 14; i++) { // as the array becomes full it creates a temp array which is double its size
                                       // and the array items are copied into it
            list.add(i);
        }

        System.out.println(list);

        WildCards<Number> list2 = new WildCards<>();
        
        for (int i = 0; i < 15; i++) {
            list2.add(i);
            
        }
        System.out.println(list2);

    }

}
