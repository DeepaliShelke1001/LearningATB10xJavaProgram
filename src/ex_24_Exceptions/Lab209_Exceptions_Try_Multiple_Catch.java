package ex_24_Exceptions;


class Lab209_Exceptions_Try_Multiple_Catch {

    public static void main(String[] args) {

        System.out.println("Stat the program");
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        //here using a multiple catch is not a good idea. if you already know how to fix a problem then
        //only mentioned proper exception.
        //if exception we dont know then use Exception by default
        System.out.println("End the program");
    }
}
