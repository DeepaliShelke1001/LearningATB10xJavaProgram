package Java_Programs;

import java.util.Scanner;

public class Task4_Positive_Negative_If_Else {
    public static void main(String[] args) {
        //Check if a Number is Positive or Negative using basic if else

        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        //Write a condition to check no is positive or negative

        //b. if the user enters a non-integer value (e.g., abc, 3.14, @) or Enter without entering anything
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println(num + " is Positive Number");
            } else if (num < 0) {
                System.out.println(num + " is Negative Number");
            } else {
                //a. Zero as Input (Unhandled Case)
                System.out.println("The number is Zero (Neither Positive Nor Negative)");
            }
        } else {
            System.out.println("Invalid input");
        }
        sc.close();

        //edge cases
        //a. Zero as Input (Unhandled Case)
        //b. if the user enters a non-integer value (e.g., abc, 3.14, @) or Enter without entering anything
    }
}
