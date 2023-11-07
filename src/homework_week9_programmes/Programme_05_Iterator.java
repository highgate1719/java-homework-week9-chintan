package homework_week9_programmes;

import java.util.ArrayList;

import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_05_Iterator {

    public static void main(String[] args) {// main method
        ArrayList<String> arrayList = new ArrayList<>();//new arraylist
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("Pink");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Purple");

        // Create an Iterator for the ArrayList

        Iterator iterator = arrayList.iterator();
        // Iterate through elements using the Iterator

        while(iterator.hasNext()){
            String element = iterator.next().toString();
            System.out.print(element +  ", " + " ");
        }
    }
}
