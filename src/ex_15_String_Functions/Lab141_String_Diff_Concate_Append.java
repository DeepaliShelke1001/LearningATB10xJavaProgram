package ex_15_String_Functions;

public class Lab141_String_Diff_Concate_Append {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World"; //SCP - 2 strings will be present
        String str3 = str1 + str2;

        System.out.println("1st Way : "+str3);
        // OR
        System.out.println("2nd Way : "+ str1.concat(str2));

        StringBuilder sb = new StringBuilder("Sonal");
        sb.append("Dive");
        System.out.println(sb);

        //StringBuffer, StringBuilder - 2 more ways to create Strings.

    }
}
