package ex_13_Functions;


import java.util.Scanner;

public class Lab128_Task {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)


        //         // Logic Building

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else{
            System.out.println("Enter the int only");
            System.exit(0);
        }

        System.out.println("Enter the number 2");
        int b = sc.nextInt();

        int sum = sum(a,b);
        int sub = sub(a,b);
        int mul = mul(a,b);
        int div = div(a,b);
        int modulus = modulus(a,b);


        System.out.println("The summation of two number is: "+sum);
        System.out.println("The Subtraction of two number is: "+sub);
        System.out.println("The Multiplication of two number is: "+mul);
        System.out.println("The Division of two number is: "+div);
        System.out.println("The Modulus of two number is: "+modulus);
    }
static int sum(int a, int b){
        return a+b;
}

    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        if(b==0){
            System.out.println("Division by Zero not allowed");
        }
        return a/b;
    }

    static int modulus(int a, int b){
        return a%b;
    }
}
