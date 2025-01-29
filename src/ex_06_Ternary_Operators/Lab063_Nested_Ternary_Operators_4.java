package ex_06_Ternary_Operators;

public class Lab063_Nested_Ternary_Operators_4 {
    public static void main(String[] args) {


        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);


        int number = 15;
        String result = (number > 10) ? (number > 20? "G > 20": "B 10 to 20") : "B";
        // condition 1 -> (number > 10)
        // condition 2 --> number > 20?
        // expression1: expression2 --> "G > 20": "B 10 to 20"
        //expression3: ->"B"
        // resolve the inner bracket first i.e. -> (number > 20? "G > 20": "B 10 to 20") -> B 10 to 20
        //String result = (number > 10) ? "B 10 to 20" : "B";
        //output will be B 10 to 20

        System.out.println(result); //B 10 to 20
    }
}
