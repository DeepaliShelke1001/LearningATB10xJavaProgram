package ex_07_Increment_Decrement_Op;

public class Lab068_Post_Increment_Operators {
    public static void main(String[] args) {

        int a= 10;
        System.out.println(++a); // Value first will be increase so a will be 11
        System.out.println(a); // value of b will be 11


        // POST incremenet  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); //10
        System.out.println(a_post); //11

    }
}
