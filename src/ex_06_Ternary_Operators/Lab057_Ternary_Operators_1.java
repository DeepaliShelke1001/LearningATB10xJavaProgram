package ex_06_Ternary_Operators;

public class Lab057_Ternary_Operators_1 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age = 10;
        String canIVote =  age >= 18 ? "Yes, You can vote" : "No, You can't Vote";

        System.out.println(canIVote); //No, You can't Vote
    }
}
