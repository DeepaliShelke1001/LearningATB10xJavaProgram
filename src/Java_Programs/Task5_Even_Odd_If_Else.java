package Java_Programs;

import java.util.Scanner;

public class Task5_Even_Odd_If_Else {

    public static void main(String[] args) {

        //Check if a Number is Even or Odd.

        //Take user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        //If user enter invalid input
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            //Check number is odd or even. O is even so no need to handle zero as input case
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}
