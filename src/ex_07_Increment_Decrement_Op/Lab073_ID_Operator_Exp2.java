package ex_07_Increment_Decrement_Op;

public class Lab073_ID_Operator_Exp2 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + ++a); //23
        System.out.println(a); //12

        // ++a -> A - ExpA  -> 11 , a -> 11 - U1
        // +
        // ++a -> B -> ExpB -> 12 ,  a -> 12 - U2
        // ExpA + ExpB -> 23



    }
}
