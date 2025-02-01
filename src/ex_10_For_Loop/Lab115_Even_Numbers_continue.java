package ex_10_For_Loop;

public class Lab115_Even_Numbers_continue {

    public static void main(String[] args) {

        for (int a = 0; a <= 50; a++) {
            if(a % 2 == 0) {
                System.out.println("Even->"+a);
                continue; // skip below code, move to top
            }
            System.out.println("Odd->"+a);
        }
    }
}
