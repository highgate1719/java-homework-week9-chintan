package homework_week9_programmes;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_02_MarkSheet {


    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in); //scanner declaration
        char continueCalculation = 'Y';

        //while loop to continue if user want to continue
        while (continueCalculation == 'Y' || continueCalculation == 'y') {

            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter Maths Marks: ");
            double mathsMarks = scanner.nextDouble();
            System.out.println("Enter Science Marks: ");
            double scienceMarks = scanner.nextDouble();
            System.out.println("Enter English Marks: ");
            double englishMarks = scanner.nextDouble();
            result(mathsMarks, scienceMarks, englishMarks, name, rollNumber);
            System.out.println("Would you like to enter another student's details? Please enter Y or  N): ");
            continueCalculation = scanner.next().charAt(0);//formula declared to enter another details
            scanner.nextLine();
        }
        System.out.println("Programme Terminated");
        scanner.close(); // close scanner object
    }


    public static void result(double Math, double Science, double English, String name, int rollNumber) {
        if (Math < 0 || Math > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) { // condition given in question
            System.out.println("Invalid input, Marks should between 0 and 100"); // print statement if data is invalid
        } else {
            //calculate total marks and result
            double totalMarks = Math + Science + English;
            double percentage = (totalMarks / 300) * 100;
            String result = (percentage >= 35 && Math >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail"; // used ternary operator

            //grade calculation
            String Grade = "-";
            if (Math >= 35 && Science >= 35 && English >= 35) {// if-else formula declared
                if (percentage <= 100 && percentage >= 80) {
                    Grade = "A+";
                } else if (percentage < 80 && percentage >= 60) {
                    Grade = "A";
                } else if (percentage < 60 && percentage >= 50) {
                    Grade = "B";
                } else if (percentage < 50 && percentage >= 35) {
                    Grade = "C";
                } else {
                    Grade = "Fail";
                }
                // Display the result
                System.out.println("Pass");
                System.out.println("Percentage: " + percentage);
                System.out.println("Grade: " + Grade);
            } else {
                System.out.println("Fail");
            }

            //Printing a Mark sheet
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|            Mark Sheet        |");
            System.out.println("|______________________________|");
            System.out.println("|   Name      : " + name + "         |");
            System.out.println("|   Roll No.  : " + rollNumber + "             |");
            System.out.println("|______________________________|");
            System.out.println("|   Subjects  :  Marks         |");
            System.out.println("|______________________________|");
            System.out.println("|   Math      : " + Math + "          |");
            System.out.println("|   Science   : " + Science + "          |");
            System.out.println("|   English   : " + English + "          |");
            System.out.println("|______________________________|");
            System.out.println("|    Total : " + totalMarks + "             | ");
            System.out.println("|______________________________|");
            System.out.println("|    Percentage  :" + percentage + "|");
            System.out.println("|    Result      :" + result + "        |");
            System.out.println("|    Grade       : " + Grade + "          |");
            System.out.println("|_______________________________|");

        }
    }


}

