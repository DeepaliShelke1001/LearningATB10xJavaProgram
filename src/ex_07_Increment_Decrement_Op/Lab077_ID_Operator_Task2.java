package ex_07_Increment_Decrement_Op;

public class Lab077_ID_Operator_Task2 {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // --a -> A - ExpA  -> 19 , a -> 19
        // +
        // a++ -> B -> ExpB -> 19 ,  a -> 20
        // +
        // a-- -> C -> ExpC -> 20 ,  a -> 19
        // ExpA + ExpB + Exp3 -> 58

    }
}
