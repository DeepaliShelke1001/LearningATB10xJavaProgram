package ex_07_Increment_Decrement_Op;

public class Lab079_ID_Operator_CLI_Task2 {
    public static void main(String[] args) {

        // Write a program to Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int largest = (n1 >= n2) ? n1 : n2;
        System.out.println("The largest number is " + largest);


    }
}
