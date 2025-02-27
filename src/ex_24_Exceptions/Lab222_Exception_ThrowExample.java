package ex_24_Exceptions;

public class Lab222_Exception_ThrowExample {


    static void validate_age(int age) {
        if (age > 18) {
            System.out.println("Age is allowed");
        } else {
            try {
                throw new Exception("Age cannot be allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
//validate_age(17);// output is RuntimeException exception
        validate_age(19);
    }

}

