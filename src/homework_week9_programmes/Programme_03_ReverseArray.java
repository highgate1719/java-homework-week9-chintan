package homework_week9_programmes;

/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme_03_ReverseArray {

    public static void main(String[] args) {//main method

        Programme_03_ReverseArray obj = new Programme_03_ReverseArray();
        obj.reverseArray();//instance method calling via object

    }

    public void reverseArray() {//instance method created
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array : ");

        for (int i = 0; i < a.length; i++)//formula declared
            System.out.print(a[i] + " ");

        System.out.println("\n------------------------------");

        System.out.println("Array in reverse order : ");
        for (int i = a.length - 1; i >= 0 ;i--)// formula declared
            System.out.print(a[i]+" ");
    }
}


