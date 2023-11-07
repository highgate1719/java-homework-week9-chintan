package homework_week9_programmes;

/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations names.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Programme_10_TubeLines {

    public static void main(String[] args) {//main method
        Programme_10_TubeLines obj = new Programme_10_TubeLines();
        obj.tubeStation();//calling instance method

    }

    public void tubeStation() { //instance method and new array list created
        ArrayList<String> station = new ArrayList<>();//new arraylist created
        station.add("Holborn");
        station.add("Bank");
        station.add("Bayswater");
        station.add("Temple");
        station.add("Moorgate");
        station.add("Paddington");
        station.add("Westminster");

        Scanner scanner = new Scanner(System.in);//new scanner created
        System.out.println("Zone 1 stations names are : " + station);
        System.out.println("____________________________________________________________________________________________");


        System.out.println("Enter any station name in lower case only :");
        String station1 = scanner.next();


        switch (station1) {// switch syntax used
            case "holborn":
                System.out.println("Lines Pass through Holborn : Picadilly Line, Central Line");
                break;
            case "bank":
                System.out.println("Lines pass through Bank : Northern line,District line and Central line ");
                break;
            case "bayswater":
                System.out.println("Line pass through Bayswater : Central line,Circle Line");
                break;
            case "temple":
                System.out.println("Line pass through Temple :Circle line,District line");
                break;
            case "moorgate":
                System.out.println("Line pass through Moorgate : Central line,Hammersmith and City, Metropolitan line.");
                break;
            case "paddington":
                System.out.println("Line pass through Paddington :Circle line,District line,Elizabeth line,Hammersmith and city,Bakerloo line ");
                break;
            case "westminster":
                System.out.println("Line pass through Westminster : Jubilee line, Northern line,Bakerloo line ");
                break;
            default:
                System.out.println("Invalid Station name ");
        }

scanner.close();// scanner closed
    }


}