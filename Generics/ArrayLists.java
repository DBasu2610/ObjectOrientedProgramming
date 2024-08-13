package Generics;

import java.util.Arrays;

public class ArrayLists {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public ArrayLists() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
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

    }

}
