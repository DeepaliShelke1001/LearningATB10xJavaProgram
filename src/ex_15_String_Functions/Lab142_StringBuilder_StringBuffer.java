package ex_15_String_Functions;

public class Lab142_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        // String - > 90%
        // StringBuilder -> 5-7% (Thread safety - we avoid it)
        // ThreadLocal -> Multi Threading ->


        StringBuffer stringBuffer = new StringBuffer("Deepali");
        stringBuffer.append("Shelke");
        System.out.println(stringBuffer); //DeepaliShelke
        stringBuffer.reverse();
        System.out.println(stringBuffer); //eklehsilapeeD


        StringBuilder stringBuilder = new StringBuilder("Rohit");
        stringBuilder.append("Shelke");
        System.out.println(stringBuilder);//RohitShelke

        stringBuilder.append(" World!");
        System.out.println(stringBuilder); // Output: RohitShelke World!


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1); //Hello

    }
}
