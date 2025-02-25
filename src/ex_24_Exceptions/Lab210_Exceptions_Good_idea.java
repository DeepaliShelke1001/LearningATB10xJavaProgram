package ex_24_Exceptions;


class Lab210_Exceptions_Good_idea {

    public static void main(String[] args) {

        System.out.println("Stat the program");
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End the program");
    }
}
