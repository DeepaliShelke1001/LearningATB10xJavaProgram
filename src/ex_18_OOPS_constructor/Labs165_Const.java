package ex_18_OOPS_constructor;

import java.util.Scanner;

public class Labs165_Const {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model Name for Tesla");
        String model_name = sc.next();
        Cars2 tesla = new Cars2(model_name, 2024);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println(" ---> ");


        System.out.println("Enter the model Name for Nano");
        String model_name2 = sc.next();
        Cars2 nano = new Cars2(model_name2, 2025);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
