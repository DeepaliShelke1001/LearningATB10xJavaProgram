package ex_13_Functions;

public class Lab125_User_Defined_Functions {
    public static void main(String[] args) {

        System.out.println("This an example of User Defined Functions");

        // Step 2 - Call the functions
        main();
        greet();
        //Math.max(3,4)
        System.out.println(""); // println is a function
        System.out.print(""); //print is a function
        System.out.printf(""); //printf is a function

    }

    // Step 1 - Declaration / Define
    static void main(){
        System.out.println("Hi, another Look like of main");
    }


    // Without Parameters and Without Return Type.
    // no argument and no return type
    static void greet(){
        System.out.println("Hi, How are you?");

    }
    }

