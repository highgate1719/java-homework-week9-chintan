package homework_week9_programmes;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */


public class Programme_09_HashMap {
    public static void main(String[] args) {//main method
        Programme_09_HashMap obj = new Programme_09_HashMap();
        obj.hashMapMethod();// instance method calling in main method using object
    }

    public void hashMapMethod(){//instance method created
        Map<Integer, String>people = new HashMap<>();//hashmap object people created
        people.put(1, "Vijay");
        people.put(2,"Ruta");
        people.put(3,"Vivek");
        people.put(4, "Mahesh");


        //for each loop created
        for (Map.Entry<Integer,String> peopleName : people.entrySet()){
            System.out.println(peopleName);
        }

    }

}
