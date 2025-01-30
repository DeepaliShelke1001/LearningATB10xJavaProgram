package ex_07_Increment_Decrement_Op;
import java.util.Scanner;  // Import the Scanner class

public class Lab066_ID_Inputs_Options {
    public static void main(String[] args) {

        // Take inputs
        //1. Hardcoded value
        int exam =56;

        //2. CLI. Here we need to provide the values
        String age_string = args[0]; // 99. If someone provide value in string then convert into int
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // 101
        System.out.println(args[3]); // 56

       // System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException
        // here in the CLI we have provided only 3 values. 4th argument is not given.


        String canIGoGoa =  age >= 24 ? "Yes" : "No";
        System.out.println(canIGoGoa);

        //3. Scanner
        Scanner s1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = s1.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input


    }
}
