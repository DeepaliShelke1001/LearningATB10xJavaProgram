package ex_25_Generics;

public class Lab224_Generics {
    static Integer temp_sum(Integer a, Integer b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int c = temp_sum(23, 34); // Integer type temp_sum fun will be execute
        System.out.println(c); //57

        String s = temp_sum("a", "b");
        System.out.println(s); //ab
    }

}

