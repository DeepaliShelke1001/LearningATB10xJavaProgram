package Java_Programs;
import java.util.Scanner;

public class Task8_Age_Check_if_else {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the age");
                int num1 = sc.nextInt();

        if (num1>=18) {
            System.out.println("You are is eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
