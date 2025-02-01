package ex_09_Switch;


public class Lab95_Switch_Case_CharType {
    public static void main(String[] args) {

        // below code is valid or not.
        char a = 'A'; //65

        switch (a) {

            case 65:
                System.out.println("A");
        } //this valid because switch can take int for char
    }
}
