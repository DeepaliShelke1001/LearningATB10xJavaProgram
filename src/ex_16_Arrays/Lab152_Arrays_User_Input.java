package ex_16_Arrays;

import java.util.Scanner;

public class Lab152_Arrays_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the numbers");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Print the user entered numbers");

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}

//Output

//Enter the Size
//3
//Enter the numbers
//23
//Enter the numbers
//3444
//Enter the numbers
//56
//Print the user entered numbers
//23
//3444
//56