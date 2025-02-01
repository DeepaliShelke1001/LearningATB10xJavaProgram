package ex_09_Switch;
import java.util.Scanner;


public class Lab93_Switch_Case {
    public static void main(String[] args) {

        // Web Automation
        // I will Ask user which browser you want me to run the code
        //chrome -> execute the chrome
        //firefox -> execute the firefox
        //edge -> execute the edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser)
        {
            case "chrome" :
                System.out.println("Starting the chrome");
                break;

            case "firefox" :
                System.out.println("Starting the firefox");
                break;

            case "edge" :
                System.out.println("Starting the edge");
                break;

            default:
                System.out.println("Please enter proper browser");
        }

    }
}
