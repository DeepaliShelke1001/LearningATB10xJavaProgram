package ex_03_Literals;

public class Lab030_Char_Literals {

    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = '9';
        char c3 = '$';

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char backspace1 = '\b';
        char carriage_return = '\r';
        System.out.println("Deepali"+new_line+"Shelke");
        // Deepali
        // Shelke
        System.out.println("Deepali"+tab_line+"Shelke"); // Deepali Shelke
        System.out.println("Deepali"+"\t"+"Shelke"); //Deepali  Shelke
        System.out.println("Deepali"+backspace1+"Shelke"); //
        System.out.println("Deepali"+carriage_return+"Shelke");// Shelke

        //Characters are divided by ASCII and Unicode.

        //ASCII - (limited numbers) A-> 65
        //UNICODE (india, jap) - Rupees - ₹
        char rupees = '₹';
        System.out.println(rupees+10);
    }
}
