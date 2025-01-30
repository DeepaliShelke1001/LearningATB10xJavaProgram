package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class Lab067_ID_Operators {
    public static void main(String[] args) {

        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.
        int a = 10;
        int b = ++a; //++a ->a+1-> 11, b -> 11
        System.out.println(b);
        System.out.println(a);

        //  Exp and Result Table
        // Line No | a | Result b
        //  10 | 10 | NA
        //  11  | 11 | 11
        //  12   | NA | 11
        //  13   | 11 | NA

    }
}
