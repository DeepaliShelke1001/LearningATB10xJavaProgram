package ex_08_If_Condition;
import java.util.Scanner;

public class Lab82_If_Else_Scanner_Input {
    public static void main(String[] args) {

       //import scanner class and Take input from scanner

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the your age:( as in integer)");
        int age = s1.nextInt(); // here we are expecting the integer
        // but if someone entered string so it will give an InputMismatchException exception



        if(age > 18){

            System.out.println("You are allowed to Vote !!");
        }
        else {

            System.out.println("You are not  allowed to Vote !!");
        }

    }
}
