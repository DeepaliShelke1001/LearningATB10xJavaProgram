package ex_15_String_Functions;

public class Lab140_String_Functions {
    public static void main(String[] args) {

        String name = "Deepali";
        System.out.println(name.length()); //7

        //1. charAt()
        System.out.println("charAt result: ");
        System.out.println(name.charAt(3)); // p (range -> 0 to 6)
       // System.out.println(name.charAt(8)); //Got an StringIndexOutOfBoundsException

        //2. Concat
        System.out.println("Concat result: ");
        System.out.println(name.concat("Shelke")); //DeepaliShelke

        //3. contains
        System.out.println("Contains result: ");
        System.out.println(name.contains("Deepali"));//true

        //4. equals
        System.out.println("Equals result: ");
        System.out.println(name.equals("Deepali"));//true

        //5. equalsIgnoreCase
        System.out.println("equalsIgnoreCase result: ");
        System.out.println(name.equalsIgnoreCase("Deepali"));//true

        //6. indexOf()
        System.out.println(name.indexOf('l'));//5

//        name = "Sonali";
//        System.out.println(name.indexOf('l'));//4


        //7. length()
        System.out.println(name.length());//7

        //8. replace( , )
        System.out.println(name.replace('D','d')); //deepali

        //9.Split()
        String name1 = "Deepali Shelke";
        String[] split1 = name1.split(" ");
        System.out.println(split1[0]); //Deepali
        System.out.println(split1[1]); //Shelke

        String str1 = "deepalishelke1001@gmail.com";
        String[] str2 = str1.split("@");
        System.out.println(str2[0]);//deepalishelke1001
        System.out.println(str2[1]);//gmail.com

        //10. substring( , )//extract a portion of the string
        //The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        String s1 = "Deepali Haushiram Shelke";
        String s2 = s1.substring(0,7);
        System.out.println("The substring is : "+s2); //Deepali

        //11. toLowerCase
        System.out.println(name.toLowerCase()); //deepali

        //12. toUpperCase
        System.out.println(name.toUpperCase()); //DEEPALI

        //13. startsWith()
        System.out.println(name.startsWith("D"));//true

        //14. endsWith()
        System.out.println(name.endsWith("P")); //false

        //15. trim()
        String name3 = "  Deepali jain  ";
        System.out.println(name3.trim());//Deepali Jain
        //only removed leading and trailing spaces only. not middle

        //16. compareTo
        String s3 = "Rahul";
        System.out.println("CompareTo function: "+(s3.compareTo("rahul"))); //-32 - returns the value in ASCII

        //17. compareToIgnoreCase
        String s4 = "Rohit";
        System.out.println("CompareToIgnoreCase function: "+s4.compareToIgnoreCase("rohit")); //0

    }


}
