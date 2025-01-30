package ex_07_Increment_Decrement_Op;

public class Lab076_ID_Operator_Task1 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + a++ + a++); //34

        System.out.println(a); //13

        // ++a -> A - ExpA  -> 11 , a -> 11
        // +
        // a++ -> B -> ExpB-> 11, a -> 12
        // +
        // a++ -> C -> ExpC-> 12, a -> 13
        // ExpA + ExpB + ExpC -> 34

    }
}
