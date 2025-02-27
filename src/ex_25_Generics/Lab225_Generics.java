package ex_25_Generics;

public class Lab225_Generics {
    static Integer temp(Integer a, Integer b) {
        System.out.println(a);
        System.out.println(b);
        return 0;
    }

//    static Integer temp(String a, String b) {
//        System.out.println(a);
//        System.out.println(b);
//        return 0;
//    }

    // T can be any Datatype and <T> is reference of T
    public static <T> T temp(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static void main(String[] args) {
        //Using generic we can take Integer, String...
        temp(23, 45);
        temp("Deep", "Shelke");
    }
}
