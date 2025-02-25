package ex_24_Exceptions;


class Lab217_Exceptions_Interview_QAns {

    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("div by Zero"); //Prints
        } finally {
            System.out.println("I will be executed anyHow!!"); //Prints
        }
    }
}

