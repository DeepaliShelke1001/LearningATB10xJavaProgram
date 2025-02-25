package ex_24_Exceptions;


class Lab211_Exceptions_No_idea {

    public static void main(String[] args) {


        // No idea about the exception then use Exception i.e. (Exception e)
        System.out.println("Stat the program");
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End the program");
    }
}
