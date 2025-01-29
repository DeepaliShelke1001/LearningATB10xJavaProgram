package ex_06_Ternary_Operators;

public class Lab061_Ternary_Operators_3 {
    public static void main(String[] args) {

        // Find the maximum number between two numbers.
        // X and Y -> Max X, y -> Ternary Op.
        int x = 10;
        int y  = 20;
        String max = x > y ? "X is max" : "Y is max";

        // OR
        //String max = x > y ? x : y ; // so ans will be 20
        System.out.println(max); // Y is max
    }
}
