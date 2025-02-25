package ex_24_Exceptions;


class Lab212_Exceptions_Multiple_program {

    public static void main(String[] args) {

        System.out.println("Stat the program");
        int a = 0;
        int b = 0;
        String s1 = null;

        try {
            b = 10 / a;
            s1.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End the program");
    }
}
