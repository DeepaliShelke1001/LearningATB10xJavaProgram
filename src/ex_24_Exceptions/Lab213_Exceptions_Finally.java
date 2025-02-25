package ex_24_Exceptions;


class Lab213_Exceptions_Finally {

    public static void main(String[] args) {

        System.out.println("Stat the program");
        int a = 1;
        int c = 0;

        try {
            c = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed always");
        }
        System.out.println("End the program");
    }
}
// Output

//Stat the program
// / by zero
//I will be executed always
//End the program

