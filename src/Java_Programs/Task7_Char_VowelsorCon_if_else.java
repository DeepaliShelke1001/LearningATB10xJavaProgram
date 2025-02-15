package Java_Programs;
import java.util.Scanner;

public class Task7_Char_VowelsorCon_if_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch1 = sc.next().charAt(0);

        //if user enter a uppercase letter so convert into lowercase
        char ch= Character.toLowerCase(ch1);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowels");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}
