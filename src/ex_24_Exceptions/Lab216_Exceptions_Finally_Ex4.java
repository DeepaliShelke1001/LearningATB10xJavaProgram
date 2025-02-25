package ex_24_Exceptions;


class Lab216_Exceptions_Finally_Ex4 {

    public static void main(String[] args) {
        //not a good idea to add  multiple try catch for every condition

        String ip = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
            b = 100 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}

