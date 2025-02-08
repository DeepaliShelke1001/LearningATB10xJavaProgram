package ex_14_Strings;

public class Lab135_String_InterviewQAns {
    public static void main(String[] args) {
        String name = "deepali";
        name.toUpperCase();
        System.out.println(name); //deepali
//Here 2 strings will be created. Because of upper case another string will be created
        //output is deepali. because uppercase value we are not storing.

        String name1 = "deepali";
        name1 = name1.toUpperCase();
        System.out.println(name); //DEEPALI

    }
}
