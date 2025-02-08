package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {

        // substring
        String s1 = "Deepali Haushiram Shelke";
        String s2 = s1.substring(0,8);
        System.out.println("The substring is : "+s2); //Deepali

//Concate
        String s3 = "Deepali";
        s3 = s3.concat("Shelke");
        System.out.println(s3); // DeepaliShelke
    } //Here two strings are created in the SCP

}
