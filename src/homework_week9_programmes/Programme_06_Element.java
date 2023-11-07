package homework_week9_programmes;
/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a
 * given array list
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Programme_06_Element {
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scanner creation
        System.out.println("Enter Index number to retrieve: ");
        int indexToRetrieve = scanner.nextInt();
        Programme_06_Element obj = new Programme_06_Element();
        obj.setArrayList(indexToRetrieve);//instance method calling via object
        scanner.close();//scanner closed
    }

    public void setArrayList(int indexToRetrieve) {//method with parameter

        ArrayList<Integer> arrayList = new ArrayList<>();//new arraylist crate

        //Add element into arraylist

        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(500);
        arrayList.add(700);
        arrayList.add(900);
        arrayList.add(1100);

        try {
            //used get method to retrieve the element at the specified index
            int element = arrayList.get(indexToRetrieve);
            System.out.println("Element at Index " + indexToRetrieve + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please choose valid index");
        }
    }
}

