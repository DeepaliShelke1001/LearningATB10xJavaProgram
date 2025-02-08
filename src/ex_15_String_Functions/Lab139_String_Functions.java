package ex_15_String_Functions;

public class Lab139_String_Functions {
    public static void main(String[] args) {

        String str1 = "Hello";//Present in the SCP -> 1 string
        String str2 = "Hello";//SCP -> still 1 string
        String str3 = new String("Hello");// OA -> 1 String

        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str3)); //true, because checks the content
    }
}
