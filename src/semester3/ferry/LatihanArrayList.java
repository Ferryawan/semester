package semester3.ferry;

import java.util.ArrayList;

public class LatihanArrayList {
    public static void main (String [] args ){
        // membuat Arraylist interger
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i=1; i<=10; i++){
            numbers.add(i);
        }

        for (int num: numbers) {
            System.out.println(num +" ");
        }
    }
}
