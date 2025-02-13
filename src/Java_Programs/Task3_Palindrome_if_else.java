package Java_Programs;

import java.util.Scanner;

public class Task3_Palindrome_if_else {
    public static void main(String[] args) {

        //Palindrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        System.out.println("The Given String is : " + str);
        String revs = "";

        // Reverse the string using charAt()
        for (int i = str.length() - 1; i >= 0; i--) {
            revs = revs + str.charAt(i); //Append the characters into revs string
       }
      System.out.println("The reverse String is: " + revs);

        // OR Reverse the string using StringBuilder
       // revs = new StringBuilder(str).reverse().toString();

        if (str.equals(revs)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}
