package homework_week9_programmes;
/**
 * Declare following two arraylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */

import java.util.ArrayList;

public class Programme_11_ArrayListCompare {
    public void arrayListCompare() { // instance method created
        ArrayList<String> c1 = new ArrayList<String>();// arraylist c1 new created
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println(" First ArrayList c1 :" + c1);

        ArrayList<String> c2 = new ArrayList<String>();// arraylist c2 new created
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println(" Second ArrayList c2 : " + c2);

        boolean compare; // for comparing both c1 and c2 true / false

        compare = c1.equals(c2);
        System.out.println("Do both array list c1 and c2 contains the same colour ?" + compare);

        c2.remove(c1);//formula declared to find common colours
        System.out.println("Common Colours in both c1 and c2 are : " + c2);
        c1.removeAll(c2);// formula declared to find non-common colours
        System.out.println("Not-Common Colours in both c1 and c2 are : " + c1);
    }


    public static void main(String[] args) {// main method

        Programme_11_ArrayListCompare obj = new Programme_11_ArrayListCompare();
        obj.arrayListCompare(); //instance method called in main method
    }
}