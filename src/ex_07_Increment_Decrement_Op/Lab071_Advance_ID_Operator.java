package ex_07_Increment_Decrement_Op;

public class Lab071_Advance_ID_Operator {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + a); //21
        // A  + B
        // A -> a++ -> Exp1(A) -> 10 and a will be increase by 1 so a-> 11
        // +
        // B -> a -> 11 ->  Exp2 -> 11
        // A + B -> 10 + 11 -> 21


        // Line No. |  a |  Exp
        // 5  |  10 | NA
        // 6  | 11 | 10 + 11 |

    }
}
