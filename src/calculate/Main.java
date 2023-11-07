package calculate;

import java.util.Scanner;

// inheritance used to extend class
public class Main extends Calculator {
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in); // new scanner
        char choice = 'Y';
        while (choice == 'Y') {

            System.out.println("Enter the first number :");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number :");
            int number2 = scanner.nextInt();

            System.out.println("Enter one of the symbols : + , - , * , /");
            char symbol = scanner.next().charAt(0);


            Calculator obj = new Calculator(); //parent class object created
            switch (symbol) {
                case '+':
                    obj.addition(number1, number2);//parent class method via object
                    break;
                case '-':
                    obj.subtraction(number1, number2);//parent class method via object
                    break;
                case '/':
                    obj.division(number1, number2);//parent class method via object
                    break;
                case '*':
                    obj.multiplication(number1, number2);//parent class method via object
                    break;
                default:
                    System.out.println("Invalid Symbol :");

            }
            obj.calculateResult(number1, number2, symbol);// calling parent class instance method with parameters
            System.out.println("Would you like to do more calculation please enter Y OF N :");
            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
        scanner.close();// closing scanner
    }
}