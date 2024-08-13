package Generics;

import java.rmi.server.Operation;
import java.util.ArrayList;

public class LambdaFunctions {  //one line functions

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        arr.forEach((item) -> {       //arrow function
            System.out.println(item*2);
        });

        Operations sum = (a,b) -> a+b;
        Operations pro = (a,b) -> a*b;
        Operations diff = (a,b) -> a-b;
        Operations quo = (a,b) -> a/b;


        LambdaFunctions lf = new LambdaFunctions();
        System.out.println(lf.operate(5,3,sum));
        System.out.println(lf.operate(5,3,pro));
        System.out.println(lf.operate(5,3,diff));
        System.out.println(lf.operate(5,3,quo));

        
    }

    private int operate(int a,int b, Operations op) {
        return op.opt(a,b);
    }

    
    
}

interface Operations {
    int opt(int a, int b);
}
