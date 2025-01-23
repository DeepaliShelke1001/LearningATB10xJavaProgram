package ex_04_Operators;

public class Lab043_OR_AND_GATE {

    public static void main(String[] args) {

        // OR  || only false || false return false

        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F
        System.out.println(true || false); //true

        // And && // only true && true returns true

       // T || T -> T
       // T || F -> F
       // F || T -> F
       // F || F -> F

        System.out.println(true && false); //false

    }
}
