package ex_13_Functions;

import java.util.Scanner;

public class Lab126_User_defined_All_One {
    public static void main(String[] args) {

        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

/*---------------------- calling functions as per types ---------*/
        // 1.Without Argument / Parameters and Without Return Type.
        // greet();

        //  2. Without Parameters but With Return Type
//      String s = greet_with_hello();
//      System.out.println(s);
//      int age_to_vote_person = age_to_vote();
//      System.out.println("Age to vote is -> " + age_to_vote_person);

        //greet_with_hello(); // we can call like this but nothing will print. because whatever returning we are
        //not storing (so nothing will happen)


        //  3. With Parameters and Without Return Type ( 90%)
        // here you can pass values directly
        // greet_with_full_details("Deepali ",27, 40000);


//       // OR you can take from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//       String name = sc.next();
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        System.out.println("Enter your salary");
//       double salary = sc.nextDouble();
//
//       greet_with_full_details(name,age,salary);


        //  4. With Parameters and With Return Type
       int sum = sum_of_two_numbers(3,4);
       int sum2 = sum_of_two_numbers(190,900);

        System.out.println(sum);
        System.out.println(sum2);

       int result = Math.max(3,4); // 4th Type

    }
/*---------------------- declaration of functions as per types ---------*/
//1. Without Parameters and Without Return Type
    static void greet()
{
    System.out.println("Hi I am 1.Without Parameters and Without Return Type");
}
// 2. Without Parameters but With Return Type : Example 1
    static String greet_with_hello(){
        return "Hi I am 2. Without Parameters but With Return Type";
    }
// Example 2:
    static int age_to_vote(){
        return 18;
    }
// 3. With Parameters and Without Return Type ( 90%)
    static void greet_with_full_details(String name, int age, double salary){
        System.out.println("Hi I am 3. With Parameters and Without Return Type");
        System.out.println("Name is : " +name +"\nAge is : "+age+"\nSalary is : "+salary);
    }
// 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        System.out.println("The summation of two numbers");
        return a+b;
    }

}





