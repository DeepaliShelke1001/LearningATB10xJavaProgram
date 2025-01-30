package ex_07_Increment_Decrement_Op;

public class Lab078_ID_Operator_CLI_Task1 {
    public static void main(String[] args) {

       // Write a program to Take a user input - Name, Age and Salary and print them in the end.

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);

        System.out.println("Name: "+args[0]);
        System.out.println("Age: "+args[1]);
        System.out.println("Salary: "+args[2]);
    }
}
