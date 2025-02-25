package ex_24_Exceptions;

public class Lab207_Exceptions_try_catch {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            //e.printStackTrace(); // This means full problem details with line no.
            //System.out.println(e.getMessage()); // / by zero
            System.out.println("Divide by zero is not possible");
        }
        System.out.println("2");

    }
}
