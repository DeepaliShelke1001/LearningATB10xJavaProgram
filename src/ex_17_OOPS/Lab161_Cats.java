package ex_17_OOPS;

public class Lab161_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();// Object but without reference

        c1.running();
        // c2.running(); // object is without reference so it will give runtime error as java.lang.NullPointerException


    }
}


class Cat {
    String name;


    void running() {
        System.out.println("Running");
    }
}
