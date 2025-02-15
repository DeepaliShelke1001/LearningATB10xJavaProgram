package Java_Programs;

import java.util.Scanner;

public class Task2_Cons_Vowels_count_String {

    public static void main(String[] args) {

        // Write a program to Count vowels and consonants in a String. e.g. pramod, → vowels - 2, consonants  - 4


        //1. Inputs -> String
        // outputs -> vowelsCount and consonantsCount

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.next();
        System.out.println("The Given string is : " + str1);

        //Convert into lowercase to handle edge case a

        String str = str1.toLowerCase();

        // 2. Logic
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Use if condition to check if the character is a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
        System.out.println("In the given string total vowels are :" + vowelsCount);
        System.out.println("In the given string total consonants are :" + consonantsCount);

        sc.close();
        //3. Edge cases
        //a. if user enters a UpperCase string then it will be count as consonants because else condition will be executed.
        // so we can convert entered string into a lowercase first.
    }
}
