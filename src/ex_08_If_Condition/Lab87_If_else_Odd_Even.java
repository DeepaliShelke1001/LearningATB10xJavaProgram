package ex_08_If_Condition;
import java.util.Scanner;

public class Lab87_If_else_Odd_Even {
    public static void main(String[] args) {

        // Create a Program - Take user input and Check weather the input is even or odd number

        // Step 1 - Figure out inputs and outputs
        // number  (int) -> i/o -> Scanner Class can be used to take input
        // string -> odd or even -> o/p , println

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int n = sc.nextInt();

        // Step 2 - Logic Rough
        // n%2 ==0 ->  even  - modulus - R == 0 -> even
        // n%2 !=0 -> odd ->


        // Step 3 :  Logic write
        if (n % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }

        sc.close(); // stop taking input now.

        // Step 4 :  edge cases
        // large int, -ve handle, zero, other input - G



    }
}
