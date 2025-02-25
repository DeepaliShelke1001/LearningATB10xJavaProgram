package ex_24_Exceptions;

public class Lab208_Exceptions_Unchecked {

    public static void main(String[] args) {

        System.out.println("Stat the program");
        String n = null;
        try{
            n.trim();
        } catch(Exception e){
            System.out.println(e.getMessage()); //Cannot invoke "String.trim()" because "n" is null
        }
        System.out.println("End the program");
    }
}
