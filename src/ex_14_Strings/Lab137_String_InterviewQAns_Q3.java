package ex_14_Strings;

public class Lab137_String_InterviewQAns_Q3 {
    public static void main(String[] args) {
        String s1 = "deepali"; //SCP
        String s4 = "deepali"; //SCP. // SCP - 1 string is available which deepali and variables s1 and s2 are
        //pointing to deepali string in SCP>


        String s2 = new String("Rahul"); //OA
        String s3 = new String("rahul"); //OA
        String s5 = new String("Hello"); //OA - 3 strings are available in the OA

//      // ==? Comparison. in the strings this checks the locations of references.
//        System.out.println(s1==s3); //false because both ara diff locations
//        System.out.println(s1==s2); //false
//        System.out.println(s2==s3); //false
//
//        System.out.println(s1==s4);//true

        // equals(content) -> check the values are equal or not
        System.out.println(s1.equals(s2)); //false
        System.out.println(s2.equals(s3)); //false
        System.out.println(s2.equalsIgnoreCase(s3)); //true

        //equalsIgnoreCase -> rahul, Rahul, rAhul, RAHUL, raHul...like this
    }
}
