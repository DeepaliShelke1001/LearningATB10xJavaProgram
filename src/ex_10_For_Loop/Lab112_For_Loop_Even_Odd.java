package ex_10_For_Loop;

public class Lab112_For_Loop_Even_Odd {

    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }
        }
    }
}
// It will run 51 times.