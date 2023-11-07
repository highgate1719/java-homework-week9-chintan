package homework_week9_programmes;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


import java.util.ArrayList;

public class Programme_04_ArrayListColours {
    public static void main(String[] args) {//main method
        ArrayList<String> colourList = new ArrayList<>();//new arraylist created
        colourList.add("White");
        colourList.add("Red");
        colourList.add("Pink");
        colourList.add("Black");
        colourList.add("Purple");
        colourList.add("Blue");
        colourList.add("Brown");
        colourList.add("Cream");
        colourList.add("Green");

        // Print out the collection using a for-each loop

        System.out.println("Colors in the ArrayList: ");
        for (String colour : colourList){//for each loop used to call string name colourList
            System.out.print(colour + "," + " ");
        }
    }

}
