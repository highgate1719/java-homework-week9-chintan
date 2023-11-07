package homework_week9_programmes;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_07_ArrayList {

    public static void main(String[] args) {
        arrayList();}//calling static method



    public static void arrayList() {//static method
        //create an arraylist
        ArrayList<String> arrayList = new ArrayList<>();// new arraylist create

        System.out.println("Before Adding Elements : ");
        // to check if arraylist is empty
        if (arrayList.isEmpty()) {//formula declared to check if array is empty or not
            System.out.println("The Arraylist is Empty: ");
        } else {
            System.out.println("The Arraylist is not Empty :");

        }
        System.out.println();

        System.out.println("After Adding Elements :");
        //To add elements in Arraylist

        arrayList.add("Item 1");
        arrayList.add("Item 2");

        //check if the arraylist is empty after adding elements
        if (arrayList.isEmpty()) {  //formula declared to check if array is empty or not
            System.out.println("The Arraylist is empty : ");
        } else {
            System.out.println("The Arraylist is not empty: ");
        }
    }
}
