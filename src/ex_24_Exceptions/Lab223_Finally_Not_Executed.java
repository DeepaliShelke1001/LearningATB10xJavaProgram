package ex_24_Exceptions;

public class Lab223_Finally_Not_Executed {

    public static void main(String[] args) {

        try {
            int a = 10/0;
            System.exit(0); //can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
        System.out.println("hello last");
    }

}

