package ex_18_OOPS_constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab163_OOPS_Cons {

    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1);
    }
}


class A {
    //Default Constructor. Constructor calls automatically when the object creation is done
    A() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("You can do anything which you want to do, when Object is created.");
//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");


    }
}